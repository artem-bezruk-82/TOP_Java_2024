import java.time.Year;
//class defined abstract because it does not make sense to create concrete instances of such abstract types like just Vehicle
public abstract class Vehicle
{
    private String make;
    private String model;
    private Year year;

    public Vehicle(String make, String model, Year year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {return make;}
    public void setMake(String make) {this.make = make;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public Year getYear() {return year;}
    public void setYear(Year year) {this.year = year;}

    public abstract String move();

    public String getDescription()
    {
        return String.format("Марка: [%s], Модель: [%s], Год: [%s]", getMake(), getModel(), getYear().toString());
    }

}
