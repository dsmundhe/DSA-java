public class SumOfall {
    public static void main(String[] args) {
        // sum of all elements
        int[] arr = { 10, 50, 90, 60, 30 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum : " + sum);
    }
}
