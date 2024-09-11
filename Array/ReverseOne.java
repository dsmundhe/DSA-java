import java.util.*;

public class ReverseOne {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println(Arrays.toString(revArr(arr)));
        System.out.println(Arrays.toString(varArr(arr)));

    }

    // less efficient method

    static int[] revArr(int[] arr) {
        int[] newarr = new int[arr.length];
        int len = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            newarr[len] = arr[i];
            len--;
        }
        arr = newarr;
        return arr;
    }

    // most efficient method
    static int[] varArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (start > end) {
                break;
            } else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        return arr;
    }
}
