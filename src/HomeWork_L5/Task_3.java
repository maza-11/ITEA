package HomeWork_L5;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int x, d;
        System.out.println("Введіть перший елемент та різницю:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        d = in.nextInt();
        int[] arr;
        arr = new int[12];
        arr[0] = x;
        for (int i = 1; i <= arr.length - 1; i++) {

            arr[i] = arr[i - 1] + d;

        }
        for (int i = 0; i < arr.length ; i++) {

            System.out.println((i + 1) + "-й елемент масива = " + arr[i]);


        }
    }
}