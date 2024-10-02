package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList personList = new PersonList(new ArrayList<>());
        int choose;
        do {
            System.out.println("\n\t-MENU-");
            System.out.println("1. Add a new student.");
            System.out.println("2. Add a new teacher.");
            System.out.println("3. Update person by id.");
            System.out.println("4. Delete person by id.");
            System.out.println("5. Display all student and teacher.");
            System.out.println("6. Find the person by id.");
            System.out.println("7. Find the student with the highest GPA.");
            System.out.println("8. Find the teacher by department.");
            System.out.println("9. Exit!");
            System.out.print("Your choose: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                    personList.addStudent();
                }
                break;

                case 2: {
                    personList.addTeacher();
                }
                break;

                case 3: {
                    System.out.print("Enter id: ");
                    String id = sc.nextLine();
                    personList.updatePerson(id);
                }
                break;

                case 4: {
                    System.out.print("Enter id: ");
                    String id = sc.nextLine();
                    personList.deletePerson(id);
                }
                break;

                case 5: {
                    personList.displayEveryone();
                }
                break;

                case 6: {
                    System.out.print("Enter id:");
                    String id = sc.nextLine();
                    personList.findPersonById(id);
                }
                break;

                case 7: {
                    System.out.println("Top student: ");
                    personList.findTopStudent().displayInfo();
                }
                break;

                case 8: {
                    System.out.print("Enter department: ");
                    String department = sc.nextLine();
                    personList.findTeacherByDepartment(department);
                }
                break;

                case 9: {
                    System.out.println("Exiting......");
                }
                break;

                default:
                    System.out.println("Invalid option. Please try again!");
            }

        } while (choose != 9);
    }

}
