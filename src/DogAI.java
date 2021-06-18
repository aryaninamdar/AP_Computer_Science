/**
 *
 * @author Aryan Inamdar
 * @version 4/3/21
 */

public class DogAI {
    private int ID;
    private double weight;

    public DogAI(int ID, double weight) {
        this.ID = ID;
        this.weight = weight;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
