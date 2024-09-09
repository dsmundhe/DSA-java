public class EvenNum {
    public static void main(String[] args) {
        // get all even numbers in array
        int[] arr = { 10, 53, 42, 63, 50, 9, 7 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("Total even Nums Are  : " + count);
    }
}
