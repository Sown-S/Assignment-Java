package Bai3;

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

    public void addStudent() {
        System.out.print("Enter ID:");
        this.id = sc.nextLine();
        System.out.print("Enter name: ");
        this.fullName = sc.nextLine();
        while (true) {
            System.out.print("Enter date of birth: ");
            String dobInput = sc.nextLine();
            try {
                this.dateOfBirth = dateFormat.parse(dobInput);
                break;
            } catch (ParseException e) {
                System.out.println("Wrong format");
            }
        }
        System.out.print("Enter GPA: ");
        this.gpa = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter major: ");
        this.major = sc.nextLine();
    }

    public void updateStudent(String id) {
        System.out.println("\tEnter update information");
        System.out.print("Enter name: ");
        this.fullName = sc.nextLine();
        while (true) {
            System.out.print("Enter date of birth: ");
            String dobInput = sc.nextLine();
            try {
                this.dateOfBirth = dateFormat.parse(dobInput);
                break;
            } catch (ParseException e) {
                System.out.println("Wrong format");
            }
        }
        System.out.print("Enter GPA: ");
        this.gpa = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter major: ");
        this.major = sc.nextLine();
    }

    @Override
    public void displayInfor() {
        System.out.println("\tINFORMATION OF STUDENT");
        System.out.println("ID: " + id);
        System.out.println("Name: " + fullName);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }

}
