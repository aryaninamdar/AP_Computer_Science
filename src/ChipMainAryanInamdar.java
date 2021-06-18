public class ChipMainAryanInamdar {
    public static void main(String[] args) {
        ChipAryanInamdar pringles = new ChipAryanInamdar(100, "Cheese", 5.99);
        ChipAryanInamdar lays = new ChipAryanInamdar(50, "Salt and Vinegar", 3.20);
        ChipAryanInamdar doritos = new ChipAryanInamdar(75, "Spicy", 6.50);
        System.out.println(pringles.getNumberOfChips());
        System.out.println(lays.getFlavor());
        System.out.println(doritos.getPrice());
    }
}
