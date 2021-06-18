public class Ch01Day1AryanInamdar {
    public static void main(String[] args) {
        // Exercise 1
        // You, your brother, and your sister are at McD and buying lunch
        double ben = 6.34;
        double amy = 8.76;
        double your = 12.34;
        double total = ben + amy + your;
        System.out.println("Total Cost: $" + total);
        Ch01Day1AryanInamdar day1 = new Ch01Day1AryanInamdar();
        day1.areaCircle1();
        day1.planterBox();
    }

    // Exercise 2
    public void areaCircle1() {
        double pi = 3.14159;
        double radius = 10.0;
        double area = pi * radius * radius;
        System.out.println("Area: " + area);
    }

    // Exercise 3
    public void planterBox() {
        // in inches
        int length = 30;
        int width = 18;
        int height = 10;
        double volume = length * width * height;
        System.out.println("Volume: " + volume);
        System.out.println(volume + " cubic inches of wood is required");
    }
}
