package HomeWork_L15.Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            int a = scanner.nextInt();
            System.out.print("Enter b: ");
            int b = scanner.nextInt();

            MyCalculator calculator = new MyCalculator();

            System.out.println("a + b = " + calculator.add(a, b));
            System.out.println("a - b = " + calculator.subtract(a, b));
            System.out.println("a * b = " + calculator.multiply(a, b));
            System.out.println("a / b = " + calculator.divide(a, b));

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
