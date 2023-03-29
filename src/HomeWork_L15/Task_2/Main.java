package HomeWork_L15.Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>(size);
        System.out.print("Введіть " + size + " елементів: ");

        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        System.out.println(numbers + " Вихідний масив");

        int productOfFirstAndLast = numbers.get(0) * numbers.get(numbers.size() - 1);
        System.out.println(productOfFirstAndLast + " Результат множнення першого і останнього елементу масива");

        numbers.set(0, productOfFirstAndLast);
        System.out.println(numbers + " Змінна зайняла 1 індекс масиву");

        Collections.sort(numbers);
        System.out.println(numbers + " Відсортований масив");
    }
}