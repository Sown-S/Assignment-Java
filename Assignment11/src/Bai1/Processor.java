package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList(new ArrayList<>());
        int choose;
        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Add a new student");
            System.out.println("2. Delete a student by ID");
            System.out.println("3. Find a student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find top student by GPA");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                    studentList.addStudent(new Student());
                }
                break;

                case 2: {
                    System.out.print("Enter student ID to delete: ");
                    String idDelete = sc.nextLine();
                    studentList.deleteStudent(idDelete);
                }
                break;

                case 3: {
                    System.out.print("Enter student ID to find: ");
                    String idFind = sc.nextLine();
                    Student foundStudent = studentList.findStudentById(idFind);
                    if (foundStudent != null) {
                        foundStudent.displayInfo();
                    }
                }
                break;

                case 4: {
                    studentList.displayAllStudents();
                }
                break;

                case 5: {
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Top student details");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found");
                    }
                }
                break;

                case 6: {
                    System.out.println("Exiting...");
                    break;
                }
                default:
                    System.out.println("Invalid option. Please try again!");
            }
        } while (choose != 6);
    }
}
