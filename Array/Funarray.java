import java.util.Arrays;

public class Funarray {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        System.out.println(arr[0][0]);
        change(arr);
        System.out.println(arr[0][0]);

    }

    static void change(int[][] arr1) {
        arr1[0][0] = 10000;
    }
}
