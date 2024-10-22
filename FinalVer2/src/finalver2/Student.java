package finalver2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void addPerson() {
        System.out.println("\tADD NEW STUDENT");
        System.out.print("Enter id: ");
        this.setId(sc.nextLine());
        System.out.print("Enter full name: ");
        this.setFullName(sc.nextLine());
        while (true) {
            try {
                System.out.print("Enter date of birth: ");
                String dobinput = sc.nextLine();
                this.setDateOfBirth(dateFormat.parse(dobinput));
                System.out.print("Enter book borrow date: ");
                String bbdinput = sc.nextLine();
                this.setBookBorrowDate(dateFormat.parse(bbdinput));
                System.out.print("Enter book return date: ");
                String brdinput = sc.nextLine();
                this.setBookReturnDate(dateFormat.parse(brdinput));
                break;
            } catch (ParseException e) {
                System.out.println("Wrong format! Please try again");
            }
        }
        System.out.print("Enter gpa: ");
        this.setGpa(sc.nextFloat());
        sc.nextLine();
        System.out.print("Enter major: ");
        this.setMajor(sc.nextLine());
    }

    @Override
    public void updatePerson(String id) {
        System.out.println("\tUPDATE STUDENT INFORMATION");
        System.out.print("Enter full name: ");
        this.setFullName(sc.nextLine());
        while (true) {
            try {
                System.out.print("Enter date of birth: ");
                String dobinput = sc.nextLine();
                this.setDateOfBirth(dateFormat.parse(dobinput));
                System.out.print("Enter book borrow date: ");
                String bbdinput = sc.nextLine();
                this.setBookBorrowDate(dateFormat.parse(bbdinput));
                System.out.print("Enter book return date: ");
                String brdinput = sc.nextLine();
                this.setBookReturnDate(dateFormat.parse(brdinput));
                break;
            } catch (ParseException e) {
                System.out.println("Wrong format! Please try again");
            }
        }
        System.out.print("Enter gpa: ");
        this.setGpa(sc.nextFloat());
        sc.nextLine();
        System.out.print("Enter major: ");
        this.setMajor(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        System.out.println("\tSTUDENT INFORMATION");
        System.out.println("ID: " + getId());
        System.out.println("Full name: " + getFullName());
        System.out.println("Date of birth: " + dateFormat.format(getDateOfBirth()));
        System.out.println("Book borrow date: " + dateFormat.format(getBookBorrowDate()));
        System.out.println("Book return date: " + dateFormat.format(getBookReturnDate()));
        System.out.println("GPA: " + getGpa());
        System.out.println("Major: " + getMajor());
    }

}
