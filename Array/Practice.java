import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // System.out.println(arr);
        // // System.out.println(Arrays.toString(arr));
        // System.out.println(arr[4]);
        // System.out.println(Arrays.toString(arr));

        int[] arr1 = { 10, 20, 30, 40, 50 };
        // System.out.println(Arrays.toString(arr1));
        // // arrayindexoutofbondException error will occure
        // System.out.println(arr1[6]);

        // print array element
        // for (int i = 0; i < arr1.length; i++) {
        // System.out.println(arr1[i]);
        // }

        // input in array;
        Scanner sc = new Scanner(System.in);
        int[] arr3 = new int[5];
        // for (int i = 0; i < arr3.length; i++) {
        // arr3[i] = sc.nextInt();
        // }
        // // print that array
        // for (int i = 0; i < arr3.length; i++) {
        // System.out.println(arr3[i]);
        // }

        // 2-D array

        int[][] arr4 = new int[3][3];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println(' ');
        }
    }
}
