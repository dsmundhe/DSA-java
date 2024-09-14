import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        // count those nums who have even num of digits
        int[] arr = { 55, 66, 857, 96, 88, 758 };
        int result = numCoutn(arr);
        System.out.println(result);
    }

    static int numCoutn(int[] arr) {
        int count = 0;
        int digitCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            while (val > 0) {
                val = val / 10;
                digitCount++;
            }
            if (digitCount % 2 == 0) {
                count++;
            }
            digitCount = 0;
        }
        return count;
    }

}
