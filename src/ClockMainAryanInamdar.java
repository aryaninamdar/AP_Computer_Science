public class ClockMainAryanInamdar {
    public static void main(String[] args) {
        ClockAryanInamdar newYork = new ClockAryanInamdar(5, 30);
        ClockAryanInamdar losAngeles = new ClockAryanInamdar(10, 0);
        ClockAryanInamdar miami = new ClockAryanInamdar(2, 30);
        newYork.addHour(3);
        losAngeles.addMinutes(30);
        miami.addHour(1);
        System.out.println(newYork.getHour());
        System.out.println(losAngeles.getMinutes());
        System.out.println(miami.getHour());
    }
}
