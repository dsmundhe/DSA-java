public class OddNum {
    public static void main(String[] args) {
        // find all Odd nums in array and print its count
        int[] arr = { 10, 2, 5, 7, 9, 3, 56 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("Total Odd nums in Array are : " + count);
    }
}
