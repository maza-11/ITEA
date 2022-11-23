package AbramyanLoops;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = in.nextDouble();
        for (double i = 1; i <= 10; i++) {
            System.out.println(i + " кілограм = " + price * i + " грн");
        }
    }
}
