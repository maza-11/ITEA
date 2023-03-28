package HomeWork_L10.Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Яким кольором хочете текст? ");
        String color = scanner.nextLine();

        Printer printer = new Printer();
        printer.print("Hello, world!", color);
    }
}

class Printer {
    public void print(String value, String color) {
        switch (color) {
            case "red":
                System.out.print("\033[31m"); // ANSI escape sequence для червоного кольору
                break;
            case "green":
                System.out.print("\033[32m"); // ANSI escape sequence для зеленого кольору
                break;
            case "blue":
                System.out.print("\033[34m"); // ANSI escape sequence для синього кольору
                break;
            default:
                // Якщо колір не відповідає жодному з визначених, використовується чорний колір
                System.out.print("\033[30m"); // ANSI escape sequence для чорного кольору
                break;
        }

        System.out.println(value);

        // Скидання форматування
        System.out.print("\033[0m");
    }
}