/**
 *
 *
 * @author Aryan Inamdar
 * @version 05-02-21
 */

import java.util.Random;

public class DicePairAI {
    DiceAI[] dice = new DiceAI[2]; // 2 element array
    Random random = new Random();

    public DicePairAI() {
        dice[0] = new DiceAI(random.nextInt(6) + 1);
        dice[1] = new DiceAI(random.nextInt(6) + 1);
    }

    public DicePairAI(int value1, int value2) {
        if ((value1 >= 1 && value1 <=6) && (value2 >= 1 && value2 <=6)) {
            dice[0] = new DiceAI(value1);
            dice[1] = new DiceAI(value2);
        }
        else {
            dice[0] = new DiceAI(random.nextInt(6) + 1);
            dice[1] = new DiceAI(random.nextInt(6) + 1);
        }
    }

    // all accessors
    public int getValue(int i) {
        return dice[i].getValue();
    }

    public int getTotal() {
        int sum = (dice[0].getValue() + dice[1].getValue());
        return sum;
    }

    public String toString() {
        String strValue1 = String.valueOf(dice[0].getValue());
        String strValue2 = String.valueOf(dice[1].getValue());
        return (strValue1 + ", " + strValue2);
    }

    public void printMe() {
        System.out.println(toString());
    }

    public boolean equals() {
        DicePairAI pair1 = new DicePairAI(random.nextInt(6) + 1, random.nextInt(6) + 1);
        DicePairAI pair2 = new DicePairAI(random.nextInt(6) + 1, random.nextInt(6) + 1);
        if (pair1.getTotal() == pair2.getTotal()) {
            return true;
        }
        else {
            return false;
        }
    }

    // all mutators
    public void setValue(int value) {
        dice[0].setValue(value); // letting DiceAI validate
        dice[1].setValue(value); // letting DiceAI validate
    }

    public void roll() {
        dice[0].roll();
        dice[1].roll();
    }


}
