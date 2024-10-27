public class Battery
{
    private BatteryStates batteryState;
    public enum BatteryStates
    {
        Charged,
        Uncharged
    }

    public Battery(BatteryStates batteryState) {this.batteryState = batteryState;}
    public BatteryStates getBatteryState() {return batteryState;}
    public void setBatteryState(BatteryStates batteryState) {this.batteryState = batteryState;}
}
