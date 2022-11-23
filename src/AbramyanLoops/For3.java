package AbramyanLoops;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        a++;
        if(a<b) {
            for (int i = b-1; i >= a; i--) {
                System.out.println(i);
            }
            System.out.println((b-a)+1);
        }
    }
}