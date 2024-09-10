package assignment10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter author's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter author's national: ");
        String national = scanner.nextLine();
        Date dateOfBirth;
        while (true) {
            System.out.print("Enter author's date of birth (dd/MM/yyyy): "); 
            String dobInput = scanner.nextLine();
            try {
                dateOfBirth = dateFormat.parse(dobInput);
                break;
            } catch (ParseException e) {
                System.out.println("Wrong format. Please try again!");
            }
        }
        Author author = new Author(name, national, dateOfBirth);
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter year of publication: ");
        int yearPublished = scanner.nextInt();
        Book book = new Book(title, author, yearPublished);
        System.out.println(book.toString());
    }
}
