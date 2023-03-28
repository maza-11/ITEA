package HomeWork_L14;

public enum Animals {
    DOG(3), CAT(5), BIRD(1);

    private final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + " - " + age + " years old";
    }

    public static void main(String[] args) {
        Animals dog = Animals.DOG;
        System.out.println(dog);

        Animals cat = Animals.CAT;
        System.out.println(cat);

        Animals bird = Animals.BIRD;
        System.out.println(bird);
    }
}
