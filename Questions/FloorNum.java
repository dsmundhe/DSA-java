public class FloorNum {
    public static void main(String[] args) {
        // find the Floor num from the array
        // Largest num which is smallest or equal to target
        // assume sorted array in ascending order

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int target = 8;
        int result = FloorN(arr, target);
        System.out.println(result);

    }

    static int FloorN(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[0] > target) {
            return -1;
        }
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
        return arr[end];
    }
}
