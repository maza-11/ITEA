package HomeWork_L2;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        if (x%2 == 0) {
//            System.out.println("Число парне");
//        } else {
//            System.out.println("Число непарне");
//        }
//    }
//}
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if ((x&1)!=1) {
            System.out.println("Число парне");
        } else {
            System.out.println("Число непарне");
        }
    }
}
