package HomeWork_L10.Task_1;

public class Vehicle {
    private String coordinate;
    private int price;
    private int speed;
    private int year_model;

    public Vehicle(String coordinate, int price, int speed, int year_model) {
        this.coordinate = coordinate;
        this.price = price;
        this.speed = speed;
        this.year_model = year_model;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear_model() {
        return year_model;
    }

    public void setYear_model(int year_model) {
        this.year_model = year_model;
    }


    public static void main(String[] args) {

        Plane Airbus = new Plane("Kyiv-Borispil", 2200, 570, 2006, 15000, 120);
        Plane AN140 = new Plane("Gostomel", 1400, 640, 1986, 19000, 10);


        Car Audi = new Car("Kharkiv", 550, 170, 2018, 300, 800, "Audi", "RS8", "Universal", "A98");
        Car ZAZ = new Car("Zaporizhya", 12, 60, 1973, 120, 52, "ZAZ", "689", "Cupe", "A92");

        Ship Poseidon = new Ship("Odesa", 190, 16, 1990, "Marocco", 1400);
        Ship Hetman_Sagaydachnyi = new Ship("Odesa", 99999999, 22, 1988, "Skadovsk", 120);


        System.out.println("Координати: " + Airbus.getCoordinate() + " | " + "Ціна: " + Airbus.getPrice() + " | " + "Швидкість: " + Airbus.getSpeed() + " | " + "Модельний рік: " + Airbus.getYear_model() + " | " + "Максимальна висота: " + Airbus.getMax_height() + " | " + "Кількість пасажирів: " + Airbus.getMax_Passengers());
        System.out.println("Координати: " + AN140.getCoordinate() + " | " + "Ціна: " + AN140.getPrice() + " | " + "Швидкість: " + AN140.getSpeed() + " | " + "Модельний рік: " + AN140.getYear_model() + " | " + "Максимальна висота: " + AN140.getMax_height() + " | " + "Кількість пасажирів: " + AN140.getMax_Passengers());

        System.out.println("Координати: " + Audi.getCoordinate() + " | " + "Ціна: " + Audi.getPrice() + " | " + "Швидкість: " + Audi.getSpeed() + " | " + "Модельний рік: " + Audi.getYear_model() + " | " + "Максимальна швидкість: " + Audi.getMax_Speed() + " | " + "Потужність двигуна: " + Audi.getMax_Power() + " | " + "Бренд: " + Audi.getBrand() + " | " + "Модель: " + Audi.getModel() + " | " + "Кузов: " + Audi.getCar_Body() + " | " + "Пальне: " + Audi.getFuel());
        System.out.println("Координати: " + ZAZ.getCoordinate() + " | " + "Ціна: " + ZAZ.getPrice() + " | " + "Швидкість: " + ZAZ.getSpeed() + " | " + "Модельний рік: " + ZAZ.getYear_model() + " | " + "Максимальна швидкість: " + ZAZ.getMax_Speed() + " | " + "Потужність двигуна: " + ZAZ.getMax_Power() + " | " + "Бренд: " + ZAZ.getBrand() + " | " + "Модель: " + ZAZ.getModel() + " | " + "Кузов: " + ZAZ.getCar_Body() + " | " + "Пальне: " + ZAZ.getFuel());

        System.out.println("Координати: " + Poseidon.getCoordinate() + " | " + "Ціна: " + Poseidon.getPrice() + " | " + "Швидкість: " + Poseidon.getSpeed() + " | " + "Модельний рік: " + Poseidon.getYear_model() + " | " + "Порт призначення: " + Poseidon.getDestination_port() + " | " + "Кількість пасажирів: " + Poseidon.getMax_Passengers());
        System.out.println("Координати: " + Hetman_Sagaydachnyi.getCoordinate() + " | " + "Ціна: " + Hetman_Sagaydachnyi.getPrice() + " | " + "Швидкість: " + Hetman_Sagaydachnyi.getSpeed() + " | " + "Модельний рік: " + Hetman_Sagaydachnyi.getYear_model() + " | " + "Порт призначення: " + Hetman_Sagaydachnyi.getDestination_port() + " | " + "Кількість пасажирів: " + Hetman_Sagaydachnyi.getMax_Passengers());

    }

}
