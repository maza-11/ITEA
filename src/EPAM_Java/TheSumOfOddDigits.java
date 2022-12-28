package EPAM_Java;

import java.util.Scanner;

public class TheSumOfOddDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ( n < 0) {
            return;
        }
        int lastDigit;
        int sum;
        for (sum = 0; n != 0; n/=10) {
            lastDigit = n%10;
            if(lastDigit % 2 != 0)
                sum += lastDigit;
        }
        System.out.println(sum);
    }
}

