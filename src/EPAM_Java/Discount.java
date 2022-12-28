package EPAM_Java;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        double purchasePrice, result = 0;

        System.out.print("Enter the cost of the purchase \n");
        Scanner sc = new Scanner(System.in);
        purchasePrice = sc.nextDouble();
        if (purchasePrice > 0 && purchasePrice < 100)
        {
            result = purchasePrice - 0.05*purchasePrice;
            System.out.printf("Your discount is 5 percent, the amount to be paid is $%.2f.\n",result);
        }
        else if (purchasePrice >= 100 && purchasePrice < 200)
        {
            result = purchasePrice - 0.1*purchasePrice;
            System.out.printf("Your discount is 10 percent, the amount to be paid is $%.2f.\n",result);
        }
        else if(purchasePrice >= 200)
        {
            result = purchasePrice - 0.15*purchasePrice;
            System.out.printf("Your discount is 15 percent, the amount to be paid is $%.2f.\n",result);
        }
        else System.out.println("The cost of the purchase should be a positive number.\n");
    }
}