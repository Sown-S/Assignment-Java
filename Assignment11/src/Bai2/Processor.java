package Bai2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList(new ArrayList<>());
        int choose;
        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Add a new Student");
            System.out.println("2. Delete Student by ID");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Display All Student");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. Display the list of students with scholarships");
            System.out.println("7. Display the total tuition fees of all students");
            System.out.println("8. Exit");
            System.out.print("Enter your choose: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                    studentList.addStudent();
                }
                break;

                case 2: {
                    System.out.print("Enter ID you want delete: ");
                    String idDelete = sc.nextLine();
                    studentList.deleteStudent(idDelete);
                }
                break;

                case 3: {
                    System.out.print("Enter ID you want find: ");
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
                    System.out.println("List of students with scholarships:");
                    studentList.findSchoolarshipStudent();
                }
                break;

                case 7: {
                    double totalTuition = studentList.caculateTuiitionOfAllStudent();
                    DecimalFormat df = new DecimalFormat("#,###.00");
                    System.out.println("Total tuition fees of all students: " + df.format(totalTuition));
                }
                break;

                case 8: {
                    System.out.println("Exiting....");
                }
                break;

                default:
                    System.out.println("Invalid option. Please try again!");

            }
        } while (choose != 8);

    }

}
