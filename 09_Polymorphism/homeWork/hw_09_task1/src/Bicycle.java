public class Bicycle extends Vehicle
{
    @Override
    public Tuple<Boolean, String> move()
    {
        return new Tuple<>(true, "Bicycle is moving!");
    }
}
