public class WeightUnit
{
    private String name;
    private String shortName;
    private double multiplier;

    public WeightUnit(String name, String shortName, double multiplier)
    {
        this.name = name;
        this.shortName = shortName;
        this.multiplier = multiplier;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getShortName() {return shortName;}
    public void setShortName(String shortName) {this.shortName = shortName;}
    public double getMultiplier() {return multiplier;}
    public void setMultiplier(double multiplier) {this.multiplier = multiplier;}
}
