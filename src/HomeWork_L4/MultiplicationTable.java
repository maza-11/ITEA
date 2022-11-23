package HomeWork_L4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
            for (int i = 1; i < 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }
    }
