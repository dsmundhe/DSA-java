public class BetweenRange {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int start = 2;
        int end = 4;
        int target = 50;

        // fun is call here and pass values
        linerSear(arr, target, start, end);
    }

    // fun for to find max between range in the array

    static void linerSear(int[] arr, int target, int start, int end) {
        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The Num is : " + max);
    }
}
