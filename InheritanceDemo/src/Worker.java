public class Worker extends Person
{
    private double hourlyPayRate;

    public Worker()
    {

    }

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate)
    {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        if (hoursWorked > 40) {
            hourlyPayRate = hourlyPayRate * 1.5;
        }
        return hoursWorked * hourlyPayRate;
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        if (hoursWorked > 40){
            return getTitle() + " " + getFirstName() + " Hours Worked: " + hoursWorked + " Pay: $" + calculateWeeklyPay(40) + " Overtime Hours: " + (hoursWorked - 40) + " Overtime Pay: " + (calculateWeeklyPay(hoursWorked) - calculateWeeklyPay(40)) + " Total Pay: " + calculateWeeklyPay(hoursWorked);
        }
        else
        {
            return getTitle() + " " + getFirstName() + " Hours Worked: " + hoursWorked + " Pay: $" + calculateWeeklyPay(hoursWorked) + " Overtime Hours: 0 " + "Total Pay: " + calculateWeeklyPay(hoursWorked);
         }
    }

}
