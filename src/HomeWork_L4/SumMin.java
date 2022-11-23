package HomeWork_L4;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
// Сума чисел між "А" і "В"
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int sum = 0;
//        a++;
//        if(a<b) {
//            for (int i = a; i <= b-1; i++) sum+=i;
//            System.out.println(sum);
//        }
//    }
//}

//Всі непарні числа між "А" і "В"
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        a++;
        if(a<b) {
            for (int i = a; i <= b-1; i++) {
                if (i % 2 != 0) System.out.println(i);
            }
        }
    }
}