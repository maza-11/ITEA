package HomeWork_L5;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] f = new int[n];
//        f[0] = 0;
//        f[1] = 1;
//        for (int i = 2; i < n; ++i) {
//            f[i] = f[i - 1] + f[i - 2];
//        }
//        for (int i = 0; i < n; ++i) {
//           System.out.println(f[i]);
//        }
//    }
//}

        int num1 = 0;
        int num2 = 1;
        int sum = 1;
        int i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int limit = scan.nextInt();
        do {
            System.out.print(sum + " ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }
        while (sum <= limit);
    }
}




