import java.util.Calendar;

public class Person
{
    // variables in classes are always private
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;




    public Person(String ID, String firstName, String lastName, String title, int YOB)
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public Person()
    {

    }

    /* public Person(String firstName, String lastName, int YOB)
    {
        this.idNum = "000001";
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
    }*/

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) { this.YOB = YOB;}

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String formalName()
    {
        return title + " " + getFullName();
    }

    public int getAge()
    {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - getYOB();
    }

    public int getAge(int year)
    {
        return year - getYOB();
    }

    public String toCSVDataRecord()
    {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }


    @Override
    public String toString() {
        return "Person{" +
                "ID= '" + ID + '\'' +
                ", firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", YOB= " + YOB +
                '}';
    }
}
