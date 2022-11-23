package AbramyanLoops;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = in.nextDouble();
        for (double i = 11; i <= 20; i++) {
            i++;
            System.out.println(i/10 + " кілограм = " + price * i + " грн");
        }
    }
}
