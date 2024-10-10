package assignment13;

public class EMP_FULLTIME extends EMPLOYEE {

    private double coefficientsSalary;

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

    public void input() {

    }

    public void output() {

    }

    @Override
    public double CalculateSalary() {

        return 0;

    }

    @Override
    public double CalculateAllowance() {

        return 0;

    }

}
