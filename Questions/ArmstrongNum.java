package Questions;

import java.util.Scanner;

public class ArmstrongNum {

    public static void main(String[] args) {
        // find armstring num;
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter Num :");
        // int num = in.nextInt();
        // int res = isPreime(num);
        // if (res == num) {
        // System.out.println(num + " Armstrong num");
        // } else {
        // System.out.println(num + " Not Armstrong num");
        // }

        // find armstrong nums for 100 to 1000;

        for (int i = 100; i < 1000; i++) {
            int res = isPreime(i);
            if (res == i) {
                System.out.println(i);
            }
        }

    }

    static int isPreime(int num) {
        int original = num;
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem * rem;
            num /= 10;
        }
        if (num == original) {
            return num;
        }
        return ans;
    }
}