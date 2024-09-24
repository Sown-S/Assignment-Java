package Bai2;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Student extends Person {

    private Float gpa;
    private String major;
    private Double tuiition;
    private Boolean schoolarship;

    public Student() {
    }

    public Student(Float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
        calculateTuition();
    }

    public Float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
        calculateTuition();
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Double getTuiition() {
        return tuiition;
    }

    public Boolean getSchoolarship() {
        return schoolarship;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = sc.nextLine();
        System.out.print("Enter full name: ");
        this.fullName = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            try {
                System.out.print("Enter date of birth: ");
                String dobInput = sc.nextLine();
                this.dateOfBirth = dateFormat.parse(dobInput);
                break;
            } catch (ParseException e) {
                System.out.println("Wrong format!");
            }
        }
        System.out.print("Enter GPA: ");
        this.gpa = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter major: ");
        this.major = sc.nextLine();
        calculateTuition();
    }

    private void calculateTuition() {
        tuiition = 10000000.0;
        if (gpa >= 9) {
            schoolarship = true;
            tuiition *= 0.5;
        } else {
            schoolarship = false;
        }
    }

    @Override
    public void displayInfo() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("\tINFORMATION");
        System.out.println("ID: " + id);
        System.out.println("Name: " + fullName);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Tuiition: " + df.format(this.tuiition));
        System.out.println("Schoolarship: " + (schoolarship ? "Yes" : "No"));
    }

}
