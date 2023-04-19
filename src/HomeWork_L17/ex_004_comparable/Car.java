package HomeWork_L17.ex_004_comparable;

public class Car implements Comparable {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Object o) {
        int Tmp = this.speed - ((Car) o).speed;

        if (Tmp == 0) {

            return this.price - ((Car) o).price;
        } else {
            return Tmp;
        }
    }
}
