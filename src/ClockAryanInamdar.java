/**
 * @author Aryan Inamdar
 * @version 01-30-21
 */

public class ClockAryanInamdar {
    private int hour;
    private int minutes;

    public ClockAryanInamdar(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void addHour(int hour) {
        this.hour += hour;
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
    }
}
