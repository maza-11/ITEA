package HomeWork_L11;

public class Outer {
    public int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static class Inner extends Outer {
        public Inner(int[] arr) {
            System.out.println("Minimum value: " + minimum(arr));
            System.out.println("Maximum value: " + maximum(arr));
            System.out.println("Average value: " + average(arr));
        }
    }
}

