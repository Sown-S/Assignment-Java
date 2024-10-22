package finalver2;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        PersonList personList = new PersonList();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Find person by id");
            System.out.println("6. Dispaly all person");
            System.out.println("7. Find the student with the highest GPA");
            System.out.println("8. Find teacher by department");
            System.out.println("9. Notify whether the book's return due date has arrived or not");
            System.out.println("0. Exit!");
            System.out.print("Enter your choose: ");
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
                    System.out.print("Enter id to update: ");
                    String id = sc.nextLine();
                    personList.updatePerson(id);
                }
                break;

                case 4: {
                    System.out.print("Enter id to delete: ");
                    String id = sc.nextLine();
                    personList.deletePersonById(id);
                }
                break;

                case 5: {
                    System.out.print("Enter id to find person: ");
                    String id = sc.nextLine();
                    personList.findPersonById(id);
                }
                break;

                case 6: {
                    personList.displayEveryone();
                }
                break;

                case 7: {
                    personList.findTopStudent();
                }
                break;

                case 8: {
                    System.out.print("Enter department to find teacher: ");
                    String department = sc.nextLine();
                    personList.findTeacherByDepartment(department);
                }
                break;

                case 9: {
                    personList.checkBookBorrowing();
                }
                break;

                case 0: {
                    System.out.println("Exiting....");
                }
                break;

                default:
                    System.out.println("Invalid option. Please try again!");
            }
        } while (choose != 0);

    }

}
