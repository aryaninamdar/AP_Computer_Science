/**
 *
 *
 * @author Aryan Inamdar
 * @version 05-02-21
 */

import java.util.Random;

public class DiceAI {
    private int value;

    public DiceAI(int value) {
        if (value >= 1 && value <=6) { // validating 1-6
            this.value = value;
        }
        else {
            this.value = 0;
        }
    }

    // all accessors
    public int getValue() {
        return value;
    }

    public String toString() {
        String strValue = String.valueOf(value);
        return strValue;
    }

    public void printMe() {
        System.out.println(toString());
    }

    // all mutators
    public void setValue(int value) {
        if (value >= 1 && value <=6) { // validating 1-6
            this.value = value;
        }
        else {
            this.value = 0;
        }
    }

    public void roll() {
        Random random = new Random();
        this.value = random.nextInt(6) + 1;
    }
}
