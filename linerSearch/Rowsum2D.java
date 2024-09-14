import java.util.Arrays;

public class Rowsum2D {

    public static void main(String[] args) {

        int[][] arr = {
                { 10, 20, 30 },
                { 10, 20, 30 },
                { 10, 20, 30 }
        };
        int[] result = rowSum(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] rowSum(int[][] arr) {
        int sum = 0;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            newArr[i] = sum;
            sum = 0;
        }
        return newArr;
    }
}