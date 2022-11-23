package HomeWork_L2;

import java.util.Scanner;

public class MaxMinFrom3 {
    public static void main(String[] args) {


        int a,b,c,d,e;
        Scanner in = new Scanner(System.in);
         a = in.nextInt();
         b = in.nextInt();
         c = in.nextInt();
         d = Math.max(a, b);
         e = Math.min(a,b);
        System.out.println("Максимальне число " + " " + Math.max(c, d));
        System.out.println("Мінімальне число " + " " + Math.min(c, e));
        System.out.println("Середнє число" + " " + (a>b?a<c?a: Math.max(b, c) :b<c?b: Math.max(a, c)));
    }
}
