public class CelingNum {
    public static void main(String[] args) {
        // find the celing number
        // Smallest num which will greater or equal to target num
        // assume ascending array

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int target = 28;
        int result = CelNum(arr, target);
        System.out.println(result);
    }

    static int CelNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
