package HomeWork_L10.Task_1;

public class Car extends Vehicle {
    private int max_Speed;
    private int max_Power;
    private String brand;
    private String model;
    private String car_Body;
    private String fuel;


    public Car(String coordinate, int price, int speed, int year_model, int max_Speed, int max_Power, String brand, String model, String car_Body, String fuel) {
        super(coordinate, price, speed, year_model);
        this.max_Speed = max_Speed;
        this.max_Power = max_Power;
        this.brand = brand;
        this.model = model;
        this.car_Body = car_Body;
        this.fuel = fuel;
    }

    public int getMax_Speed() {
        return max_Speed;
    }

    public void setMax_Speed(int max_Speed) {
        this.max_Speed = max_Speed;
    }

    public int getMax_Power() {
        return max_Power;
    }

    public void setMax_Power(int max_Power) {
        this.max_Power = max_Power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCar_Body() {
        return car_Body;
    }

    public void setCar_Body(String car_Body) {
        this.car_Body = car_Body;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
