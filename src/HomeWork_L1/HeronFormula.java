package HomeWork_L1;

import java.util.Scanner;

public class HeronFormula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input some number");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double p = (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("S = " + S);
    }
}
