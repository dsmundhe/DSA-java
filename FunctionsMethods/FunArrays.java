package FunctionsMethods;

public class FunArrays {
    public static void main(String[] args) {
        // max find function for array
        int[] arr = { 10, 20, 30, 40, 50, 60, 85, 78, 96 };

        // for max
        int maxnum = max(arr);
        System.out.println(maxnum);

        // for min
        int minnum = min(arr);
        System.out.println(minnum);
    }

    // find max
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // find min
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
