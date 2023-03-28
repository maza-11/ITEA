package HomeWork_L10.Task_1;

public class Plane extends Vehicle{
    private int max_height;
    private int max_Passengers;


    public Plane(String coordinate, int price, int speed, int year_model, int max_height, int max_Passengers) {
        super(coordinate, price, speed, year_model);
        this.max_height = max_height;
        this.max_Passengers = max_Passengers;
    }

    public int getMax_height() {
        return max_height;
    }

    public void setMax_height(int max_height) {
        this.max_height = max_height;
    }

    public int getMax_Passengers() {
        return max_Passengers;
    }

    public void setMax_Passengers(int max_Passengers) {
        this.max_Passengers = max_Passengers;
    }
}
