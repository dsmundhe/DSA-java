package Questions;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = in.nextInt();
        boolean res = isPreime(num);
        System.out.println(res);
    }
 
    static boolean isPreime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (num > c * c) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return num < c * c;
    }
}