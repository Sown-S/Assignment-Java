package Bai4;

import java.text.DateFormat;
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

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
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
        System.out.print("Enter department: ");
        this.setDepartment(sc.nextLine());
        System.out.print("Enter teaching subject: ");
        this.setTeachingSubject(sc.nextLine());
    }

    @Override
    public void updatePerson(String id) {
        System.out.println("\tUPDATE TEACHER INFORMATION");
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
        System.out.print("Enter department: ");
        this.setDepartment(sc.nextLine());
        System.out.print("Enter teaching subject: ");
        this.setTeachingSubject(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        System.out.println("\tINFORMATION TEACHER");
        System.out.println("ID: " + getId());
        System.out.println("Full name: " + getFullName());
        System.out.println("Date of birth: " + getDateOfBirth());
        System.out.println("Department: " + getDepartment());
        System.out.println("Teaching subject: " + getTeachingSubject());
    }

}
