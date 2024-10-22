package finalver2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setDepartment(String depertment) {
        this.department = depertment;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void addPerson() {
        System.out.println("\tADD NEW TEACHER");
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
        System.out.print("Enter department: ");
        this.setDepartment(sc.nextLine());
        System.out.print("Enter teaching subject: ");
        this.setTeachingSubject(sc.nextLine());
    }

    @Override
    public void updatePerson(String id) {
        System.out.println("\tUPDATE TEACHER INFORMATION");
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
        System.out.print("Enter department: ");
        this.setDepartment(sc.nextLine());
        System.out.print("Enter teaching subject: ");
        this.setTeachingSubject(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        System.out.println("\tTEACHER INFORMATION");
        System.out.println("ID: " + getId());
        System.out.println("Full name: " + getFullName());
        System.out.println("Date of birth: " + dateFormat.format(getDateOfBirth()));
        System.out.println("Book borrow date: " + dateFormat.format(getBookBorrowDate()));
        System.out.println("Book return date: " + dateFormat.format(getBookReturnDate()));
        System.out.println("Department: " + getDepartment());
        System.out.println("Teaching subject: " + getTeachingSubject());
    }

}
