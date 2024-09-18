public class AgnosticBS {
    public static void main(String[] args) {

        int[] arrAsc = { 10, 20, 30, 40, 50, 60, 70 };
        int[] arrDecs = { 70, 60, 50, 40, 30, 20, 10 };
        int target = 70;
        int result = binarySea(arrDecs, target);
        System.out.println(result);

    }

    static int binarySea(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] > target) {
                    end = mid - 1;
                }
                if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
            return -1;
        } else if (arr[start] > arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] > target) {
                    start = mid + 1;
                }
                if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
            return -1;
        }
        return -1;
    }
}
