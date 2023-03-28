package HomeWork_L6;

import java.util.Scanner;

public class Task_2 {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Яка кільскість клієнтів?");
        Scanner in = new Scanner(System.in);
        String number = in.next();

        int factorial = Integer.parseInt(number);
        factorial = factorial(factorial);

        System.out.println("Кількість можливих варіантів доставлення товару: " + factorial);
    }
}

