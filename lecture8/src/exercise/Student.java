package exercise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    String id;
    String fullname;
    float GPA;
    Date dateOfBirth;
    String major;

    Student() {
    }

    public Student(String id, String fullname, float GPA, Date dateOfBirth, String major) {
        this.id = id;
        this.fullname = fullname;
        this.GPA = GPA;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
    }

    Student enterStudentInfo(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = sc.next();
        sc.nextLine();
        System.out.print("Enter name: ");
        this.fullname = sc.nextLine();
        System.out.print("Enter GPA: ");
        this.GPA = Float.parseFloat(sc.nextLine());
        System.out.print("Enter date of birth: ");
        String DateOfBirthString = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateOfBirth = sdf.parse(DateOfBirthString);
        } catch (Exception e) {
            System.out.println("Wrong Fomat");
        }
        System.out.print("Enter major: ");
        this.major = sc.nextLine();
        student = new Student(id, fullname, GPA, dateOfBirth, major);
        return student;
    }

//    void displayStudentInfo(Student sv) {
//        System.out.println("ID: " + sv.id);
//        System.out.println("Name: " + sv.fullname);
//        System.out.println("GPA: " + sv.GPA);
//        System.out.println("Date Of Birth: " + sv.dateOfBirth);
//        System.out.println("Major: " + sv.major);
//    }
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "\n\tInfomation" + "\nID: " + id + "\nName: " + fullname + "\nGPA: " + GPA + "\nDate Of Birth: " + dateOfBirth + "\nMajor: " + major;
    }

}
