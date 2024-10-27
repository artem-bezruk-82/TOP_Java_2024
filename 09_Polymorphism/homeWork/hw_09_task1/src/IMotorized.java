public interface IMotorized
{
    boolean isEngineOn();
    Tuple<Boolean, String> start();
    void stop();
}
