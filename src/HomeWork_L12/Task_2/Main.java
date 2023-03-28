package HomeWork_L12.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature value:");
        double value = scanner.nextDouble();

        System.out.println("Enter the source temperature scale (C, F, K):");
        String sourceScale = scanner.next().toUpperCase();

        System.out.println("Enter the target temperature scale (C, F, K):");
        String targetScale = scanner.next().toUpperCase();

        ConverteTemperature converter;

        switch (sourceScale) {
            case "C":
                if (targetScale.equals("K")) {
                    converter = new CelsiusToKelvinConverter();
                } else {
                    converter = new CelsiusToFahrenheitConverter();
                }
                break;
            case "F":
                if (targetScale.equals("C")) {
                    converter = new FahrenheitToCelsiusConverter();
                } else {
                    converter = new FahrenheitToKelvinConverter();
                }
                break;
            default:
                if (targetScale.equals("C")) {
                    converter = new KelvinToCelsiusConverter();
                } else {
                    converter = new KelvinToFahrenheitConverter();
                }
        }

        double result = converter.convert(value);
        System.out.printf("%.2f %s = %.2f %s%n", value, sourceScale, result, targetScale);
    }
}