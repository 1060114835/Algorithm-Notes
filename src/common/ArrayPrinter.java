package common;

public class ArrayPrinter {

    public static void printArray(String prefix, int[] data) {
        prefix = prefix.isEmpty() ? prefix : prefix + ": ";
        StringBuilder sb = new StringBuilder(prefix);
        sb.append("[");
        for (int i : data) sb.append(i).append(",");
        if (sb.length() > 1) sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static void printArray(int[] data) {
        printArray("", data);
    }



}
