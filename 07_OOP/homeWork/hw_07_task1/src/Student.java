public class Student extends Person
{
    public static final int gradeMin = 1;
    public static final int gradeMax = 10;
    private int grade;

    public Student(String name, int age, int grade)
    {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {return grade;}

    public void setGrade(int grade)
    {
        if (grade <= gradeMax && grade >= gradeMin)
            this.grade = grade;
        else
            throw new RuntimeException();
    }

    @Override
    public String performDuty()
    {
        return String.format("Студент %s учится в %d классе",getName(),getGrade());
    }

    public String study()
    {
        return String.format("Студент %s делает домашнее задание",getName());
    }
}
