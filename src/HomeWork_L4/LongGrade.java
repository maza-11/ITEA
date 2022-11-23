package HomeWork_L4;

import java.util.Scanner;

public class LongGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextInt();
        long grade;
        for (; number > 0; number = number / 10) {
            grade = number % 10;
            System.out.println(grade);
        }
    }
}