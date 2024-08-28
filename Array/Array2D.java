import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        // 2-D array
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // another way to declare
        int[][] arr1 = {
                { 1, 2, 3, 4 },
                { 5, 6, 9, 8 },
                { 6, 3, 9 }
        };
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        // input for 2-D array
        int[][] arr2 = new int[3][3];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = in.nextInt();
            }
        }
        // treaditional way to print
        for (int j = 0; j < arr2.length; j++) {
            for (int j2 = 0; j2 < arr2.length; j2++) {
                System.out.print(arr2[j][j2] + " ");
            }
            System.out.println("");
        }

        // new way to print
        for (int[] nums : arr2) {
            System.out.println(Arrays.toString(nums));
        }

    }
}