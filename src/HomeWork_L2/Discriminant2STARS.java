package HomeWork_L2;

import java.util.Scanner;

public class Discriminant2STARS {
    public static void main(String[] args) {
        double a,b,c,D;
        Scanner in = new Scanner(System.in);
        System.out.println("Input some number");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        D = b * b - 4 * a * c;
        // Пошук дискримінанта числа та визначення кількості коренів
        if (D > 0) {
            System.out.println("D = " + D + " " + "Коренів буде два");
        }
        else if (D == 0) {
            System.out.println("D = " + D + " " + "Рівно один корінь");
        }
        else {
            System.out.println("D = " + D + " " + "Коренів немає");
        }
        // Визначення коренів квадратного рівння за допомопогою дискримінанта числа
//        if (D > 0) {
//            double x1, x2;
//            x1 = (-b - Math.sqrt(D)) / (2 * a);
//            x2 = (-b + Math.sqrt(D)) / (2 * a);
//            System.out.println("Корні рівняння: x1 = " + x1 + ", x2 = " + x2);
//        }
//        else if (D == 0) {
//            double x;
//            x = -b / (2 * a);
//            System.out.println("Рівняння має дійсний корінь: x = " + x);
//        }
//        else {
//            System.out.println("Рівняння немає дійсних коренів");
//        }
    }
}
