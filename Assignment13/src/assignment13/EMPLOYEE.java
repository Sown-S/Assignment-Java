package assignment13;

import java.util.Date;

abstract class EMPLOYEE implements IEMPLOYEE {

    private String empID;
    private String empName;
    private Date empDateOfBirth;
    private Date startDate;

    public EMPLOYEE() {
    }

    public EMPLOYEE(String empID, String empName, Date empDateOfBirth, Date startDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateOfBirth = empDateOfBirth;
        this.startDate = startDate;
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public Date getEmpDateOfBirth() {
        return empDateOfBirth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public static double getBASIC_SALARY() {
        return BASIC_SALARY;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateOfBirth(Date empDateOfBirth) {
        this.empDateOfBirth = empDateOfBirth;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void input() {

    }

    public void output() {

    }

    public int CalculateSeniority() {

        return 0;

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
