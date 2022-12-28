package HomeWork_L5;

public class Task_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {5, 6, 7, 8, 9};
        int[] result = new int[4];
        for (int i = 0; i < result.length ; i++) {
            result[i] = arr[i] + arr1[i];
            System.out.println(result[i]);
        }
        System.out.println(arr1[4]);
    }
}
