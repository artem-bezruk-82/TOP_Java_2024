public class Engine
{
    private EngineStates engineState;

    public Engine()
    {
        this.engineState = EngineStates.OFF;
    }

    public enum EngineStates
        {
            ON,
            OFF
        }

    public EngineStates getEngineState() {return this.engineState;}
    public void setEngineState(EngineStates engineState) {this.engineState = engineState;}
}
