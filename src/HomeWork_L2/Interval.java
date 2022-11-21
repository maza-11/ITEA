package HomeWork_L2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x >= 0 && x <= 14) {
            System.out.println("Число " + x + " знаходиться у диапазоні чисел від 0 до 14");
        } else if (x >= 15 && x <= 35) {
            System.out.println("Число " + x + " знаходиться у диапазоні чисел від 15 до 35");
        } else if (x >= 36 && x <= 50) {
            System.out.println("Число " + x + " знаходиться у диапазоні чисел від 36 до 50");
        } else if (x >= 51 && x <= 100) {
            System.out.println("Число " + x + " знаходиться у диапазоні чисел від 51 до 100");
        }
        else {
            System.out.println("Число не потрапляє ні в один диапазон чисел від 0 до 100");
        }
    }
}
