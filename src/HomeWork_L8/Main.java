package HomeWork_L8;

public class Main {

    public static void main(String[] args) {


        Car car1 = new Car("Toyota", "Corolla", 2022, 20000);
        Car car2 = new Car("Ford", "Mustang", 2021, 35000);
        Car car3 = new Car("Honda", "Civic", 2022, 22000);
        Car car4 = new Car("Chevrolet", "Camaro", 2021, 40000);
        Car car5 = new Car("Nissan", "Altima", 2022, 23000);


        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());

    }

}
