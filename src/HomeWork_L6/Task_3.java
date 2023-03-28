package HomeWork_L6;

public class Task_3 {
    public double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public double calculateAverage(double num1, double num2, double num3, double num4) {
        return (num1 + num2 + num3 + num4) / 4;
    }

    public double calculateAverage(double num1, double num2, double num3, double num4, double num5) {
        return (num1 + num2 + num3 + num4 + num5) / 5;
    }

    public void findMinMaxAndAverage(double num1, double num2, double num3, double num4, double num5) {
        double average = calculateAverage(num1, num2, num3, num4, num5);
        double min = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));
        double max = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is: " + max);
        System.out.println("Average value is: " + average);
    }
}


