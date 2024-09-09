import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        // print reverse array
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] rarr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            rarr[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(rarr));
    }
}
