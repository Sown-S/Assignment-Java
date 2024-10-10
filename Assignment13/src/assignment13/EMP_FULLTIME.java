package assignment13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EMP_FULLTIME extends EMPLOYEE {

    private double coefficientsSalary = CalculateSeniority();

    public EMP_FULLTIME() {
    }

    public EMP_FULLTIME(double coefficients_salary) {
        this.coefficientsSalary = coefficients_salary;
    }

    public double getCoefficients_salary() {
        return coefficientsSalary;
    }

    public static double getBASIC_SALARY() {
        return BASIC_SALARY;
    }

    public void setCoefficients_salary(double coefficients_salary) {
        this.coefficientsSalary = coefficients_salary;
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
        System.out.print("Enter coefficients Salary: ");
        this.setCoefficients_salary(sc.nextDouble());
    }

    public void output() {
        System.out.println("\tEMPLOYEE FULLTIME");
        System.out.println("ID: " + getEmpID());
        System.out.println("Name: " + getEmpName());
        System.out.println("Date of birth: " + dateFormat.format(getEmpDateOfBirth()));
        System.out.println("Start date: " + dateFormat.format(getStartDate()));
        System.out.println("Coefficients Salary: " + getCoefficients_salary());
    }

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * coefficientsSalary + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 1000000;
        } else if (seniority >= 5) {
            return 500000;
        } else {
            return 0;
        }
    }

}
