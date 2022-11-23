package HomeWork_L2;

import java.util.Scanner;

public class CubePerimeterAndSquare {
    public static void main(String[] args) {
        double a,S,V;
        Scanner in = new Scanner(System.in);
        System.out.println("Input some number");
        a = in.nextDouble();
        S = 6*a*a;
        V = Math.pow(a,3);
        System.out.println("S = " + S);
        System.out.println("V = " + V);
    }
}
