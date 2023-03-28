package HomeWork_L9.Task_3;

public class Main {
    public static void main(String[] args) {

        Address address_1 = new Address(1, "Ukraine", "Vinnitsa", "Soborna", 7, 77);
        Address address_2 = new Address(2, "Ukraine", "Irpin", "Tsentralna.", 8, 88);
        Address address_3 = new Address(3, "Ukraine", "Kyiv", "Pl. Peremohy", 1, 111);

        System.out.println(address_1.getIndex() + "\n" + address_1.getCountry() + "\n" + address_1.getCity() + "\n" + address_1.getStreet() + "\n" + address_1.getHouse() + "\n" + address_1.getApartment()+"\n");
        System.out.println(address_2.getIndex() + "\n" + address_2.getCountry() + "\n" + address_2.getCity() + "\n" + address_2.getStreet() + "\n" + address_2.getHouse() + "\n" + address_2.getApartment()+"\n");
        System.out.println(address_3.getIndex() + "\n" + address_3.getCountry() + "\n" + address_3.getCity() + "\n" + address_3.getStreet() + "\n" + address_3.getHouse() + "\n" + address_3.getApartment()+"\n");
    }
}