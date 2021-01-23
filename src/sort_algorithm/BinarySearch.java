package sort_algorithm;



import java.util.Arrays;

/**
 * 二分查找
 * 前提：数据排列有序
 * 时间复杂度: O(logN)
 */
public class BinarySearch {

    /**
     * 二分查找，标准版本
     */
    public static int binarySearch(int[] data, int target) {
        Arrays.sort(data);
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data[mid] == target) return mid;
            else if (data[mid] > target) right = mid - 1;
            else if (data[mid] < target) left = mid + 1;
        }
        return -1;
    }

    /**
     * 二分查找，寻找左侧边界
     */
    public static int binarySearchLeftBoundary(int[] data, int target) {
        Arrays.sort(data);
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data[mid] == target) right = mid -1;
            else if (data[mid] > target) right = mid - 1;
            else if (data[mid] < target) left = mid + 1;
        }
        if (left >= data.length || data[left] != target) return -1;
        return left;
    }

    /**
     * 二分查找，寻找右侧边界
     */
    public static int binarySearchRightBoundary(int[] data, int target) {
        Arrays.sort(data);
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data[mid] == target) left = mid + 1;
            else if (data[mid] > target) right = mid - 1;
            else if (data[mid] < target) left = mid + 1;
        }
        if (right < 0 || data[right] != target) return -1;
        return right;
    }

}
