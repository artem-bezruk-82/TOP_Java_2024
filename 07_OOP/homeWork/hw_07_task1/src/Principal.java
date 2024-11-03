public class Principal extends Person
{
    private int yearsOfExperience;

    public Principal(String name, int age, int yearsOfExperience)
    {
        super(name, age);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {return yearsOfExperience;}

    public void setYearsOfExperience(int yearsOfExperience)
    {
        if (yearsOfExperience >= 0)
            this.yearsOfExperience = yearsOfExperience;
        else
            throw new RuntimeException("Values below zero ara not allowed");
    }

    public String manage()
    {
        return String.format("Директор %s менеджирует", getName());
    }

    @Override
    public String performDuty()
    {
        return String.format("Директор %s управляет %d лет",getName(),getYearsOfExperience());
    }
}
