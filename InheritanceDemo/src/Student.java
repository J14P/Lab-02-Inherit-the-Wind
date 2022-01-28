public class Student extends Person
{
    private int gradeLevel;
    private int gradeAverage;

    public Student(String ID, String firstName, String lastName, String title, int YOB, int gradeLevel, int gradeAverage)
    {
        super(ID, firstName, lastName, title, YOB);
        this.gradeAverage = gradeAverage;
        this.gradeLevel = gradeLevel;
    }

    public Student(Person perp, int gradeLevel, int gradeAverage) {

        this.setID(perp.getID());
        this.setFirstName(perp.getFirstName());
        this.setLastName(perp.getLastName());
        this.setTitle(perp.getTitle());
        this.setYOB(perp.getYOB());

        this.gradeLevel = gradeLevel;
        this.gradeAverage = gradeAverage;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public int getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(int gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Person{" +
                "ID= '" + getID() + '\'' +
                ", firstName= '" + getFirstName() + '\'' +
                ", lastName= '" + getLastName() + '\'' +
                ", YOB= " + getYOB() +
                '}' +
                "gradeLevel=" + gradeLevel +
                ", gradeAverage=" + gradeAverage +
                '}';
    }
}
