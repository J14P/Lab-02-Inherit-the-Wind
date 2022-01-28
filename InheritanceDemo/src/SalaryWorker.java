public class SalaryWorker extends Worker
{
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary)
    {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);

        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        return getTitle() + " " + getFirstName() + " Hours Worked: " + hoursWorked + " Pay: $" + calculateWeeklyPay(hoursWorked) + " Total Pay (A fraction of the yearly salary) : " + calculateWeeklyPay(hoursWorked);
    }


    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
