package HomeWork_L14;

public enum Vehicles {
    CAR(20000, "Red"),
    TRUCK(40000, "Blue"),
    MOTORCYCLE(10000, "Black");

    private final int cost;
    private final String color;

    Vehicles(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name() + " (" + color + ") - Cost: $" + cost;
    }

    public static void main(String[] args) {
        Vehicles car = Vehicles.CAR;
        System.out.println(car);

        Vehicles truck = Vehicles.TRUCK;
        System.out.println(truck);

        Vehicles motorcycle = Vehicles.MOTORCYCLE;
        System.out.println(motorcycle);
    }
}
