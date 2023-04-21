package HomeWork_L24_25.Task1;

public class Main {
    public static void main(String[] args) {
        FirstClass first = new FirstClass();
        SecondClass second = new SecondClass();
        first.setSecond(second);
        second.setFirst(first);

        new Thread(() -> first.methodOne()).start();
        new Thread(() -> second.methodTwo()).start();
    }
}