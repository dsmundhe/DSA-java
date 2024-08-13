package Basics;

public class Shadowing {
    // global scope
    static int x = 100;

    public static void main(String[] args) {
        x = 55;
        System.out.println(x);
        val();
    }

    static void val() {
        System.out.println(x);
    }

}
