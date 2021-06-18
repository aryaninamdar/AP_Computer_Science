/**
 * Write a description of class Client05aYourName
 *
 * @author Aryan Inamdar
 * @version 3/6/21
 */

public class CounterWUndoAryanInamdar {
    private int count;

    public CounterWUndoAryanInamdar(int initialCount) {
        this.count = initialCount;
    }

    public void click() {
        count += 1;
    }

    public void reset() {
        count = 0;
    }

    public void undo() {
        count -= 1;
    }

    public int getValue() {
        return count;
    }
}
