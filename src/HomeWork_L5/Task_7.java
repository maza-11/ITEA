package HomeWork_L5;

import java.util.Scanner;

public class Task_7 {
    static void cube() {
        Scanner in = new Scanner(System.in);
        double x = in.nextInt();
        double y = 3;
        double result = 0;
        result = Math.pow(x,y);
        System.out.println(result);
    }

    public static void main(String[] args) {
        cube();
    }
}
