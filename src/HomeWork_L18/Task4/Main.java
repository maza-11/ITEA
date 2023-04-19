package HomeWork_L18.Task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Додаємо рядки до списку
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            list.add(line);
        }

        // Виводимо рядки на екран
        for (String s : list) {
            System.out.println(s);
        }
    }
}