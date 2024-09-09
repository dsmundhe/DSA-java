public class MaxInArray {
    public static void main(String[] args) {
        // find max num in array
        int[] arr = { 10, 20, 30, 50, 89 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            } else if (min >= arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }

}
