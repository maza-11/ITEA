package HomeWork_L18.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            words.add(scanner.nextLine());
        }

        doubleValues(words);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void doubleValues(List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String word = list.get(i);
            list.add(i + 1, word);
            size++;
        }
    }
}