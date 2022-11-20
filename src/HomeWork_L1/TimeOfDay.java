package HomeWork_L1;

import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n>0 && n<13) {
            System.out.println("Good morning!");
        } else if (n>12 && n<21) {
            System.out.println("Good day!");
        } else if (n>20 && n<25) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Веддіть число від 1-24");
        }
    }
}
