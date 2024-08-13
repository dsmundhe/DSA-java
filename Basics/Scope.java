package Basics;

public interface Scope {
    public static void main(String[] args) {
        // block scope
        int num = 20;
        {
            num = 100;
            System.out.println(num);
            int num2 = 50;
        }
        // it is not allow in java
        // System.out.println(num2);

        // function scope
        fun();

        // loop scope
        for (int i = 0; i <= 0; i++) {
            System.out.println(x);
            int val = 50;
        }
        // this is not possible in java
        // System.out.println(i);

        // System.out.println(val);

    }

    int x = 50;

    static void fun() {
        int x = 60;
        System.out.println(x);
    }
}
