import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array Introduciotn

        // array decleration
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));

        // value insert in array using for loop

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        System.out.println(Arrays.toString(arr));

        // values print using forloop

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        // using for each loop
        for (int num : arr) {
            System.out.println(num);
        }
        // second way to initialization of array

        int[] arr1 = { 10, 20, 30, 40, 506, 0 };
        System.out.println(Arrays.toString(arr1));

        // change perticular element through index

        arr1[1] = 10000;
        System.out.println(Arrays.toString(arr1));

        // Array of Object
        String[] str = new String[5];
        System.out.println(Arrays.toString(str));

        // With elements

        String[] str1 = { "Dipak", "Samadhan", "Mundhe" };
        System.out.println(Arrays.toString(str1));

        // pring using for loop
        for (String val : str1) {
            System.out.println(val);
        }

        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }

        // Print perticular element
        String fname = str1[0];
        String mname = str1[1];
        String lname = str1[2];
        System.out.println("First Name : " + fname);
        System.out.println("Middle Name : " + mname);
        System.out.println("Last Name : " + lname);
    }
}