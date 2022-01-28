public class PersonDriver
{
    public static void main(String[] args) {
        Person jill = new Person("00001", "Jill", "Daniels", "Ms.", 1990);

        System.out.println(jill);

        Student jillStudent = new Student(jill, 5, 94);
        System.out.println(jillStudent);
    }
}
