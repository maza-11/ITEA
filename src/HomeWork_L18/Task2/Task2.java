package HomeWork_L18.Task2;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> numbersList = getIntegerList();
        int minNumber = getMinimum(numbersList);
        System.out.println("Minimum number is: " + minNumber);
    }

    public static LinkedList<Integer> getIntegerList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter integer #" + i + ": ");
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static int getMinimum(LinkedList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }
}