package sort_algorithm;


import java.util.Arrays;

/**
 * 二分查找
 */
public class BinarySearch {

    public static int binarySearch(int[] data, int target) {
        ArrayPrinter.printArray("source data", data);
        Arrays.sort(data);
        ArrayPrinter.printArray("sorted data", data);
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

}
