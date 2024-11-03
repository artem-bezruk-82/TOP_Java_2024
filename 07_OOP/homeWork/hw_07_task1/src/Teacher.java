public class Teacher extends Person
{
    private String subject;
    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {return subject;}
    public void setSubject(String subject) {this.subject = subject;}

    @Override
    public String performDuty()
    {
        return String.format("Учитель %s преподает предмет %s", getName(), getSubject());
    }

    public String teach()
    {
        return String.format("Учитель %s проводит занятие по предмету %s", getName(),getSubject());
    }
}
