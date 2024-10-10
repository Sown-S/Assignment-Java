package assignment13;

import java.util.Calendar;
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

    public abstract void input();

    public abstract void output();

    public int CalculateSeniority() {
        if (getStartDate() == null) {
            System.out.println("Start date is not set. Please enter a valid start date.");
            return 0;
        }
        Calendar current = Calendar.getInstance();
        int currentYear = current.get(Calendar.YEAR);
        Calendar start = Calendar.getInstance();
        start.setTime(getStartDate());
        int startYear = start.get(Calendar.YEAR);
        return currentYear - startYear;
    }
}
