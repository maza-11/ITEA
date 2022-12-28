package EPAM_Java;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        float miles, v, hours = 0.5f;

        System.out.print("Enter the number of miles\n");
        Scanner sc = new Scanner(System.in);
        miles = sc.nextFloat();

        int n = 1;
        while(n == 1) //checking for correct numeric input
        {
            if (miles <= 0)
            {
                System.out.println("Enter the correct value\n");
                System.out.print("Enter the number of miles\n");
                miles = sc.nextFloat();
            }
            else n=0;
        }

        v = miles/hours;
        if (v > 45)
            System.out.println("The driver violated the traffic rules.\n");
        else
            System.out.println("The driver didn't violate the traffic rules.\n");
    }
}