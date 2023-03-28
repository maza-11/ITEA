package HomeWork_L12.Task_1;

// Абстрактний клас Animal
public abstract class Animal {
    // Абстрактні методи
    public abstract void eat();
    public abstract void sleep();
    public abstract void move();
    public abstract void makeSound();
    public abstract void reproduce();

    // Конкретний метод, який може бути успадкований
    public void breathe() {
        System.out.println("Animal is breathing.");
    }

    public void attack() {
        System.out.println("Animal is attack. ");
    }
    public void die() {
        System.out.println("Animal is die.");
    }
}

