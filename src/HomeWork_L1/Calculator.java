package HomeWork_L1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1, number2, result;
        char operator;
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число:");
        number1 = in.nextDouble();
        System.out.println("Виберть дію: (+, -, *, /,)");
        operator = in.next().charAt(0);
        System.out.println("Введіть число:");
        number2 = in.nextDouble();
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Помилка!Невірна операція");
                return;
        }
        System.out.println("Результат");
        System.out.println(result);
    }
}
