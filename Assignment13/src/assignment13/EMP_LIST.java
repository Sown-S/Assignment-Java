package assignment13;

import java.util.ArrayList;
import java.util.Scanner;

public class EMP_LIST {

    private ArrayList<EMPLOYEE> emp_list;

    public EMP_LIST() {
        this.emp_list = new ArrayList<>();
    }

    public EMP_LIST(ArrayList<EMPLOYEE> emp_list) {
        this.emp_list = emp_list;
    }

    public ArrayList<EMPLOYEE> getEmp_list() {
        return emp_list;
    }

    public void setEmp_list(ArrayList<EMPLOYEE> emp_list) {
        this.emp_list = emp_list;
    }

    Scanner sc = new Scanner(System.in);

    public void addNew() {
        System.out.println("Add new employee");
        System.out.println("1. Add employee fulltime");
        System.out.println("2. Add employee parttime");
        System.out.println("3. Back");
        System.out.print("Your choose: ");
        int chooseadd = sc.nextInt();
        switch (chooseadd) {
            case 1: {
                System.out.print("Enter number of employee fulltime: ");
                int num = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < num; i++) {
                    EMP_FULLTIME fulltime = new EMP_FULLTIME();
                    System.out.println("Enter information of employee fulltime " + (i + 1));
                    fulltime.input();
                    this.emp_list.add(fulltime);
                }
            }
            break;

            case 2: {
                System.out.print("Enter number of employee parttime: ");
                int num = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < num; i++) {
                    EMP_PARTTIME parttime = new EMP_PARTTIME();
                    System.out.println("Enter information of employee parttime " + (i + 1));
                    parttime.input();
                    this.emp_list.add(parttime);
                }
            }
            break;

            case 3: {
                System.out.println("Going back...");
            }
            break;

            default:
                System.out.println("Invalid option. Please try again!");
        }
    }

    public void update() {
        System.out.print("Enter id to update: ");
        String id = sc.nextLine();
        int i = 0;
        for (EMPLOYEE employee : emp_list) {
            if (employee.getEmpID().equals(id)) {
                employee.update();
                System.out.println("Updated successfully for employee with ID " + id);
                i++;
                break;
            }
        }
        if (i == 0) {
            System.out.println("No employee with ID " + id + " found");
        }
    }

    public void delete(String empID) {
        for (int i = 0; i < this.emp_list.size(); i++) {
            if (emp_list.get(i).getEmpID().equals(empID)) {
                emp_list.remove(i);
                System.out.println("Delected employee with ID " + empID);
                return;
            }
        }
        System.out.println("No employee with ID " + empID + " found");
    }

    public void find(String empID) {
        for (EMPLOYEE employee : emp_list) {
            if (employee.getEmpID().equals(empID)) {
                System.out.println("Information of this employee: ");
                employee.output();
                return;
            }
        }
        System.out.println("No employee with ID " + empID + " found");
    }

    public void display() {
        if (emp_list.isEmpty()) {
            System.out.println("Employee list is empty!");
        } else {
            for (EMPLOYEE employee : emp_list) {
                employee.output();
                System.out.println("----------------------------------------");
            }
        }
    }

    public void menu() {
        EMP_LIST emplist = new EMP_LIST();
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Add new employee");
            System.out.println("2. Update employee");
            System.out.println("3. Delete employee by ID");
            System.out.println("4. Find employee by ID ");
            System.out.println("5. Display all employee");
            System.out.println("0. Exit!");
            System.out.print("Your choose: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1: {
                    emplist.addNew();
                }
                break;

                case 2: {
                    emplist.update();
                }
                break;

                case 3: {
                    System.out.print("Enter id to delete: ");
                    String id = sc.nextLine();
                    emplist.delete(id);
                }
                break;

                case 4: {
                    System.out.print("Enter id to find: ");
                    String id = sc.nextLine();
                    emplist.find(id);
                }
                break;

                case 5: {
                    emplist.display();
                }
                break;

                case 0: {
                    System.out.println("Exiting....");
                }
                break;

                default:
                    System.out.println("Invalid option. Please try again!");
            }

        } while (menu != 0);
    }

}
