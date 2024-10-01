package Bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Student extends Person {

    private Float gpa;
    private String major;

    public Student() {
    }

    public Student(Float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void addPerson() {
        System.out.print("Enter ID: ");
        this.setId(sc.nextLine());
        System.out.print("Enter full name: ");
        this.setFullName(sc.nextLine());
        while (true) {
            try {
                System.out.print("Enter date of birth: ");
                String dobInput = sc.nextLine();
                this.setDateOfBirth(dateFormat.parse(dobInput));
                break;
            } catch (ParseException e) {
                System.out.println("Wrong format!");
            }
        }
        System.out.print("Enter GPA: ");
        this.setGpa(sc.nextFloat());
        sc.nextLine();
        System.out.print("Enter major: ");
        this.setMajor(sc.nextLine());
    }

    @Override
    public void updatePerson(String id) {
        System.out.println("\tUPDATE STUDENT INFORMATION");
        System.out.print("Enter ID: ");
        this.setId(sc.nextLine());
        System.out.print("Enter full name: ");
        this.setFullName(sc.nextLine());
        while (true) {
            try {
                System.out.print("Enter date of birth: ");
                String dobInput = sc.nextLine();
                this.setDateOfBirth(dateFormat.parse(dobInput));
                break;
            } catch (ParseException e) {
                System.out.println("Wrong format!");
            }
        }
        System.out.print("Enter GPA: ");
        this.setGpa(sc.nextFloat());
        sc.nextLine();
        System.out.print("Enter major: ");
        this.setMajor(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        System.out.println("\tINFORMATION STUDENT");
        System.out.println("ID: " + getId());
        System.out.println("Full name: " + getFullName());
        System.out.println("Date of birth: " + getDateOfBirth());
        System.out.println("GPA: " + getGpa());
        System.out.println("Major: " + getMajor());
    }

}
