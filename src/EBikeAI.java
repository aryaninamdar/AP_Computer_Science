/**
 *
 * @author Aryan Inamdar
 * @version 4/17/21
 */

public class EBikeAI extends BicycleAI {
    private int batterySize;
    private double range;

    public EBikeAI() {
        batterySize = 0;
        range = 0.0;
    }

    public EBikeAI(int batterySize, double range) {
        this.batterySize = batterySize;
        this.range = range;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }
}
