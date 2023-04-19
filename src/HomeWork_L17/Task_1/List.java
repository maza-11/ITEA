package HomeWork_L17.Task_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        java.util.List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = scanner.nextLine();
            list.add(element);
        }

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
