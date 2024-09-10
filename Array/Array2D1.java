import java.util.*;

public class Array2D1 {
    public static void main(String[] args) {
        // concept or 2D array
        int[][] arr = new int[3][3];
        int[][] arr1 = { { 2, 3, 5 }, { 5, 6, 3 }, { 10, 5, 9 } };

        // print

        // for (int i = 0; i < arr1.length; i++) {
        // for (int j = 0; j < arr1[i].length; j++) {
        // System.out.print(arr1[i][j] + " ");
        // }
        // System.out.println();
        // }

        // input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // inhance for loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
