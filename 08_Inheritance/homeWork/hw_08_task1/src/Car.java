import java.time.Year;

public class Car extends Vehicle
{
    private int numberOfDoors;

    public Car(String make, String model, Year year, int numberOfDoors)
    {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {return numberOfDoors;}

    public void setNumberOfDoors(int numberOfDoors) throws Exception
    {
        if (numberOfDoors < 0)
            throw new Exception("Doors can not be less than zero");

        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getDescription() // taken from parent class and overridden
    {
        return String.format("%s, Дверей: [%d]", super.getDescription(), getNumberOfDoors());
    }

    @Override //abstract method defined to be implemented by all derived classes
    public String move()
    {
        return "I can move because besides I am a car, I am a Vehicle as well";
    }

    public String moveReverse() // just car specific feature
    {
        return "I can move reverse, because I am car and reverse moving is my feature.";
    }
}
