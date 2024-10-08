package assignment13;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EMP_PARTTIME extends EMPLOYEE {

    private int numberOfWorkdays;

    public EMP_PARTTIME() {
    }

    public EMP_PARTTIME(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public int getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public static double getBASIC_SALARY() {
        return BASIC_SALARY;
    }

    public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public void input() {
        System.out.print("Enter ID: ");
        this.setEmpID(sc.nextLine());
        System.out.print("Enter name: ");
        this.setEmpName(sc.nextLine());
        while (true) {
            try {
                System.out.print("Enter date of birth: ");
                String dobinput = sc.nextLine();
                this.setEmpDateOfBirth(dateFormat.parse(dobinput));
                System.out.print("Enter start date: ");
                String sdinput = sc.nextLine();
                this.setStartDate(dateFormat.parse(sdinput));
                break;
            } catch (ParseException e) {
                System.out.println("Wrong format! Please enter again");
            }
        }
        System.out.print("Enter number of workdays: ");
        this.setNumberOfWorkdays(sc.nextInt());
        sc.nextLine();
    }
    
    public void update() {
        System.out.println("UPDATE EMPLOYEE PARTTIME");
        System.out.print("Enter name: ");
        this.setEmpName(sc.nextLine());
        while (true) {
            try {
                System.out.print("Enter date of birth: ");
                String dobinput = sc.nextLine();
                this.setEmpDateOfBirth(dateFormat.parse(dobinput));
                System.out.print("Enter start date: ");
                String sdinput = sc.nextLine();
                this.setStartDate(dateFormat.parse(sdinput));
                break;
            } catch (ParseException e) {
                System.out.println("Wrong format! Please enter again");
            }
        }
        System.out.print("Enter number of workdays: ");
        this.setNumberOfWorkdays(sc.nextInt());    
    }

    public void output() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("\tEMPLOYEE PARTTIME");
        System.out.println("ID: " + getEmpID());
        System.out.println("Name: " + getEmpName());
        System.out.println("Date of birth: " + dateFormat.format(getEmpDateOfBirth()));
        System.out.println("Start date: " + dateFormat.format(getStartDate()));
        System.out.println("Number of workdays: " + getNumberOfWorkdays());
        System.out.println("Salary: " + df.format(CalculateSalary()));
    }

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * numberOfWorkdays / 26 + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 500000;
        } else if (seniority >= 5) {
            return 300000;
        } else {
            return 0;
        }
    }

}
