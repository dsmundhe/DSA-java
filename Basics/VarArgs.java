package Basics;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        int[] result = arr(5, 6, 3, 6, 5, 8, 9, 7, 3, 5);
        System.out.println(Arrays.toString(result));
    }

    static int[] arr(int... v) {
        return v;
    }
}