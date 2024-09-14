public class BinarySearch01 {
    public static void main(String[] args) {

        // BinraySearch Program

        // -1 will be return if element is not present
        // othrwise index nums will be return
        
        int[] arr = { 1, 2, 5, 6, 8, 9, 12, 14, 15, 18, 19, 21, 25, 26, 28, 29, 35, 36, 39 };
        int result = binSearch(arr, 8);
        System.out.println(result);

    }

    static int binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
