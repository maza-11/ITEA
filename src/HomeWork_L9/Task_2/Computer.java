package HomeWork_L9.Task_2;

public class Computer {
    String name;
    int RAM;
    int SSD;
    int inch;

    public Computer(String name, int RAM, int SSD, int inch) {
        this.name = name;
        this.RAM = RAM;
        this.SSD = SSD;
        this.inch = inch;
    }

    public static void main(String[] args) {


        Computer[] Computers = new Computer[5];

        Computers[0] = new Computer("HP", 4, 128, 14);
        Computers[1] = new Computer("Asus", 8, 256, 15);
        Computers[2] = new Computer("LENOVO", 16, 512, 16);
        Computers[3] = new Computer("Acer", 32, 128, 13);
        Computers[4] = new Computer("DELL", 8, 512, 17);


        for (Computer arrays : Computers
        ) {
            System.out.println("Company: " + arrays.name + ", "+ "RAM: " + arrays.RAM + "Gb" + ", " + "SSD: " + arrays.SSD + ", " + "Inch: " + arrays.inch);
        }
    }

}
