package HomeWork_L2;

import java.util.Scanner;

public class FiveDigits {
    public static void main(String[] args) {
        int x,x1,x2,x3,x4,x5;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        x1=x/10000;
        x2=(x/1000)%10;
        x3=(x/100)%10;
        x4=(x/10)%10;
        x5=x%10;
        System.out.println("Sum of fivedigits number:" + " " + (x1+x2+x3+x4+x5));
    }
}
