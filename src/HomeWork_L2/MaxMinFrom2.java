package HomeWork_L2;

import java.util.Scanner;

public class MaxMinFrom2 {
    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Input two numbers");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Максимальне число" + " " + Math.max(a,b));
        System.out.println("Мінімальне число" + " " + Math.min(a,b));
    }
}
