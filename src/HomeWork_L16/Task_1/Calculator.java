package HomeWork_L16.Task_1;

import java.util.Scanner;

public class Calculator<T extends Number> {

    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T add() {
        if(num1 instanceof Integer) {
            return (T) (Integer.valueOf(num1.intValue() + num2.intValue()));
        } else if(num1 instanceof Double) {
            return (T) (Double.valueOf(num1.doubleValue() + num2.doubleValue()));
        } else {
            return null;
        }
    }

    public T subtract() {
        if(num1 instanceof Integer) {
            return (T) (Integer.valueOf(num1.intValue() - num2.intValue()));
        } else if(num1 instanceof Double) {
            return (T) (Double.valueOf(num1.doubleValue() - num2.doubleValue()));
        } else {
            return null;
        }
    }

    public T multiply() {
        if(num1 instanceof Integer) {
            return (T) (Integer.valueOf(num1.intValue() * num2.intValue()));
        } else if(num1 instanceof Double) {
            return (T) (Double.valueOf(num1.doubleValue() * num2.doubleValue()));
        } else {
            return null;
        }
    }

    public T divide() {
        if(num1 instanceof Integer) {
            return (T) (Integer.valueOf(num1.intValue() / num2.intValue()));
        } else if(num1 instanceof Double) {
            return (T) (Double.valueOf(num1.doubleValue() / num2.doubleValue()));
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        Calculator<Double> calculator = new Calculator<>(num1, num2);

        System.out.println("Sum: " + calculator.add());
        System.out.println("Difference: " + calculator.subtract());
        System.out.println("Product: " + calculator.multiply());
        System.out.println("Quotient: " + calculator.divide());

        scanner.close();
    }
}
