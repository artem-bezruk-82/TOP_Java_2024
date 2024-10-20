import java.time.Year;

public class Motorcycle extends Vehicle
{
    boolean hasSidecar;

    public Motorcycle(String make, String model, Year year, boolean hasSidecar)
    {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    public boolean getHasSidecar() {return this.hasSidecar;}
    public void setHasSidecar(boolean hasSidecar) {this.hasSidecar = hasSidecar;}

    @Override
    public String getDescription() // taken from parent class and overridden
    {
        return String.format("%s, Коляска: [%s]",
                super.getDescription(), getHasSidecar() ? "Есть" : "Нет");
    }

    @Override //abstract method defined to be implemented by all derived classes
    public String move()
    {
        return "I can move because besides I am a Motorcycle, I am a Vehicle as well";
    }

    public String highchairStunt() // just Motorcycle specific feature
    {
        if (!hasSidecar)
            return "I can make highchair stunts, because I am Motorcycle and highchair capability is my feature.";
        else
            return "I can't make highchair stunts, because I am equipped with sidecar";
    }

}
