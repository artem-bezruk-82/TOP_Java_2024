public class Boat extends Vehicle implements IMotorized
{
    private Engine engine;

    public Boat(Engine engine)
    {
        this.engine = engine;
    }

    @Override
    public Tuple<Boolean, String> move()
    {
        return new Tuple<>(isEngineOn(),
                isEngineOn() ? "Boat is moving!" : String.format("Boat can not move. Engine is %s", engine.getEngineState()));
    }

    public Engine getEngine() {return engine;}
    public void setEngine(Engine engine) {this.engine = engine;}

    @Override
    public boolean isEngineOn()
    {
        return engine.getEngineState() == Engine.EngineStates.ON;
    }

    @Override
    public Tuple<Boolean, String> start()
    {
        if (!isEngineOn())
            engine.setEngineState(Engine.EngineStates.ON);

        return new Tuple<>(true,"Boat's engine started");
    }

    @Override
    public void stop()
    {
        if (isEngineOn())
            engine.setEngineState(Engine.EngineStates.OFF);
    }
}
