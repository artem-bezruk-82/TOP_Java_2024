public class Car extends Vehicle implements IMotorized
{
    private Engine engine;
    private Battery battery;

    public Car(Engine engine, Battery battery)
    {
        this.engine = engine;
        this.battery = battery;
    }

    public Battery getBattery() {return this.battery;}
    public void setBattery(Battery battery) {this.battery = battery;}
    public Engine getEngine() {return this.engine;}
    public void setEngine(Engine engine) {this.engine = engine;}

    @Override
    public Tuple<Boolean, String> move()
    {
        return new Tuple<>(isEngineOn(),
                isEngineOn() ? "Car is moving!" : String.format("Car can not move. Engine is %s", engine.getEngineState()));
    }

    public boolean isBatteryCharged()
    {
        return battery.getBatteryState() == Battery.BatteryStates.Charged;
    }

    @Override
    public boolean isEngineOn()
    {
        return engine.getEngineState() == Engine.EngineStates.ON;
    }

    @Override
    public Tuple<Boolean, String> start()
    {
        if (!isEngineOn())
        {
            if (!isBatteryCharged())
                return new Tuple<>(false, String.format("Can not start engine. Battery is %s", battery.getBatteryState()));

            engine.setEngineState(Engine.EngineStates.ON);

        }
        return new Tuple<>(true,"Car's engine started");
    }

    @Override
    public void stop()
    {
        if (isEngineOn())
            engine.setEngineState(Engine.EngineStates.OFF);
    }
}
