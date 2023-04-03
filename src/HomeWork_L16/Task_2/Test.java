package HomeWork_L16.Task_2;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int OperandFirstInteger = sc.nextInt();
            System.out.println(OperandFirstInteger);
        }catch (Exception exception){
            System.out.printf("Error");
        }

    }
}