package AbramyanLoops;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a<b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
            System.out.println((b-a)+1);
        }
    }
}
