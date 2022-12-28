package HomeWork_L5;

import java.util.Scanner;

public class Task_8 {
    static void graduate1(){
        double a,b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        for (double i = a; i <=b ; i++) {
            i = Math.pow(a,b);
            System.out.println(i);
        }
    }
    static void graduate2(){
        double a,b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        for (double i = a; i <=b ; i++) {
            i = Math.pow(a,b);
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
       graduate1();
       graduate2();
    }
}
