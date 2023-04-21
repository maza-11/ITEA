package HomeWork_L24_25.Task1;

public class SecondClass {
    private FirstClass first;

    public synchronized void methodTwo() {
        System.out.println("MethodTwo in SecondClass is executing");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        first.methodOne();
    }

    public synchronized void setFirst(FirstClass first) {
        this.first = first;
    }
}
