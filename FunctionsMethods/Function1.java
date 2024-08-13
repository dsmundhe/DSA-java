package FunctionsMethods;

public class Function1 {
    public static void main(String[] args) {
        // fun for sum tow nums

        int a = 20;
        int b = 30;
        int ans = sum(a, b);
        System.out.println("Sum : " + ans);

        // fun for subrtaction
        int num1 = 100;
        int num2 = 55;
        int res = sub(num1, num2);
        System.out.println("Sub : " + res);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }
}
