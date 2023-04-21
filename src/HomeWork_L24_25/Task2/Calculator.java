package HomeWork_L24_25.Task2;

import java.util.function.BiFunction;

public class Calculator {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addition = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> subtraction = (x, y) -> x - y;
        BiFunction<Integer, Integer, Integer> multiplication = (x, y) -> x * y;
        BiFunction<Integer, Integer, Integer> division = (x, y) -> x / y;

        int x = 10;
        int y = 5;

        System.out.println("x + y = " + addition.apply(x, y));
        System.out.println("x - y = " + subtraction.apply(x, y));
        System.out.println("x * y = " + multiplication.apply(x, y));
        System.out.println("x / y = " + division.apply(x, y));
    }
}
