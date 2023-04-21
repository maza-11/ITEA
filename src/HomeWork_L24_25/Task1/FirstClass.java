package HomeWork_L24_25.Task1;

public class FirstClass {
    private SecondClass second;

    public synchronized void methodOne() {
        System.out.println("MethodOne in FirstClass is executing");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        second.methodTwo();
    }

    public synchronized void setSecond(SecondClass second) {
        this.second = second;
    }
}

