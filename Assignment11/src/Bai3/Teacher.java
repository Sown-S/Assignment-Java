package Bai3;

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

    public void addTeacher() {
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
        System.out.print("Enter department: ");
        this.department = sc.nextLine();
        System.out.print("Enter teaching subject: ");
        this.teachingSubject = sc.nextLine();        
    }

    public void updateTeacher(String id) {
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
        System.out.print("Enter department: ");
        this.department = sc.nextLine();
        System.out.print("Enter teaching subject: ");
        this.teachingSubject = sc.nextLine();   
    }

    @Override
    public void displayInfor() {
        System.out.println("\tINFORMATION OF TEACHER");
        System.out.println("ID: " + id);
        System.out.println("Name: " + fullName);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Department: " + department);
        System.out.println("Teaching subject: " + teachingSubject);
    }

}
