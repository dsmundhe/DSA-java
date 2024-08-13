package Basics;

public class OverLoading {
    // method OverLoading.
    public static void main(String[] args) {
        int a, b, c, sum;
        a = 10;
        b = 20;
        c = 20;
        sum = sum1(a, b);
        System.out.println(sum);
        sum = sum1(a, b, c);
        System.out.println(sum);
    }

    // fun for sum of two nums
    static int sum1(int a, int b) {
        return a + b;
    }

    // fun for sum of three nums
    static int sum1(int a, int b, int c) {
        return a + b + c;
    }
}
