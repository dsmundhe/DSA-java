public class linearSeacrech {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        // find 4o in array
        int target = 80;
        linerSer(arr, target);

    }

    static void linerSer(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Num is at : " + i);
                return;
            }

        }
        System.out.println("Num is not int this lisit....");

    }
}