/**
 * @author Aryan Inamdar
 * @version 01-30-21
 */

public class ChipAryanInamdar {
    private int numberOfChips;
    private String flavor;
    private double price;

    public ChipAryanInamdar(int numberOfChips, String flavor, double price) {
        this.numberOfChips = numberOfChips;
        this.flavor = flavor;
        this.price = price;
    }

    public int getNumberOfChips() {
        return numberOfChips;
    }

    public void setNumberOfChips(int numberOfChips) {
        this.numberOfChips = numberOfChips;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
