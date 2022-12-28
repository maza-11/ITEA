package HomeWork_L5;

import java.util.Scanner;

public class Task_5 {
    static void divide(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println("True");
        }
        else System.out.println("False");
    }
    public static void main(String[] args) {
        divide();
    }
}
