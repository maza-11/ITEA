package HomeWork_L12.Task_1;

// Клас, який успадковує клас Animal
public class Dog extends Animal {
    // Перевизначення абстрактних методів
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Dog is running.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }

    @Override
    public void reproduce() {
        System.out.println("Dog is reproducing.");
    }
}
