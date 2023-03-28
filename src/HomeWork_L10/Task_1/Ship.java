package HomeWork_L10.Task_1;

public class Ship extends Vehicle  {
    private String destination_port;

    private int max_Passengers;


    public Ship(String coordinate, int price, int speed, int year_model, String destination_port, int max_Passengers) {
        super(coordinate, price, speed, year_model);
        this.destination_port = destination_port;
        this.max_Passengers = max_Passengers;
    }

    public String getDestination_port() {
        return destination_port;
    }

    public void setDestination_port(String destination_port) {
        this.destination_port = destination_port;
    }

    public int getMax_Passengers() {
        return max_Passengers;
    }

    public void setMax_Passengers(int max_Passengers) {
        this.max_Passengers = max_Passengers;
    }
}
