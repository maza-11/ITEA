package HomeWork_L10.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Яким кольором хочете текст? ");
        String color = scanner.nextLine();

        ColorPrinter colorPrinter = new ColorPrinter(color);
        colorPrinter.print("Hello, world!");
    }
}