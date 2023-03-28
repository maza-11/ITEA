package HomeWork_L6;

import java.util.Scanner;

public class Task_1 {


    static int credit(int a) {
        a = 700 - a;
        System.out.println("Залишок для погашення кредиту = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введіть сумму для поповнення:");
        Scanner in = new Scanner(System.in);


        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("Ви попопвнили на таку суму = " + result);

        result = credit(result);
        if (result == 0) {
            System.out.println("Борг погашено");
        }
    }
}
