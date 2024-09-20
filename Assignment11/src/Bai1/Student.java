package Bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Student extends Person {

    Float gpa;
    String major;

    public Student() {
    }

    public Student(Float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    void addStudent() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter ID: ");
        this.id = sc.nextLine();
        System.out.print("Enter full name: ");
        this.fullname = sc.nextLine();
        while (true) {
            System.out.print("Enter date of birth: ");
            String dobInput = sc.nextLine();
            try {
                this.dateOfBirth = dateFormat.parse(dobInput);
                break;
            } catch (ParseException e) {
                System.out.println("Wrong Fomat!");
            }
        }
        System.out.print("Enter GPA: ");
        this.gpa = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter major: ");
        this.major = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        System.out.println("\tINFORMATION");
        System.out.println("ID: " + id);
        System.out.println("Name: " + fullname);
        System.out.println("Birthday: " + dateOfBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }

}
