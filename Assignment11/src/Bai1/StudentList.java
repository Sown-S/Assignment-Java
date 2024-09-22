package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    private ArrayList<Student> studentList;

    public StudentList() {
    }

    public StudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    Scanner sc = new Scanner(System.in);

    public void addStudent(Student student) {
        System.out.print("Enter numbers of student to add: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            Student std = new Student();
            System.out.println("Enter information of student " + (i + 1));
            std.addStudent();
            this.studentList.add(std);
        }
    }

    public void deleteStudent(String id) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.remove(i);
                System.out.println("Student ID " + id + " has been deleted");
                return;
            }
        }
        System.out.println("No student found with ID " + id);
    }

    public Student findStudentById(String id) {
        for (Student std : studentList) {
            if (std.getId().equals(id)) {
                System.out.println("Information of student ID " + id);
                return std;
            }
        }
        System.out.println("No student found with ID " + id);
        return null;
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Student list is empty");
        } else {
            for (Student std : studentList) {
                std.displayInfo();
                System.out.println("-------------------------------------------------");
            }
        }
    }

    public Student findTopStudent() {
        if (studentList.isEmpty()) {
            System.out.println("Student list is empty");
            return null;
        }
        Student topStudent = studentList.get(0);
        for (Student std : studentList) {
            if (std.getGpa() > topStudent.getGpa()) {
                topStudent = std;
            }
        }
        return topStudent;
    }
}
