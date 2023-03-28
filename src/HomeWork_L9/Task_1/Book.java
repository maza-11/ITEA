package HomeWork_L9.Task_1;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть автора книги:");
        Author.author = sc.nextLine();
        System.out.println("Введіть назву книги:");
        Title.title = sc.nextLine();
        System.out.println("Введіть зміст книги:");
        Content.content = sc.nextLine();

        Author.show();
        Title.show();
        Content.show();

    }
}
