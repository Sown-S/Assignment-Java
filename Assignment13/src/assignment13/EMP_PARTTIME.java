package assignment13;

public class EMP_PARTTIME extends EMPLOYEE {

    private int numberOfWorkdays;

    public EMP_PARTTIME() {
    }

    public EMP_PARTTIME(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public static double getBASIC_SALARY() {
        return BASIC_SALARY;
    }

    public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
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
