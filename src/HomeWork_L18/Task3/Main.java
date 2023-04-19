package HomeWork_L18.Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> families = new HashMap<>();


        while (true) {
            String city = scanner.nextLine();
            if (city.equals("end")) {
                break;
            }
            String family = scanner.nextLine();
            families.put(city, family);
        }

        String cityToFind = scanner.nextLine();
        String familyFound = families.get(cityToFind);
        System.out.println(familyFound);
    }
}