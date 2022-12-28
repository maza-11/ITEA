package HomeWork_L5;

import java.util.Scanner;

public class Task_6 {
    static void SquarePlusTwo() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int result = 0;
        result = (x*x)+2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        SquarePlusTwo();
    }
}
