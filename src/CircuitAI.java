/**
 * Write a description of class ComponentYI here.
 *
 * @author Aryan Inamdar
 * @version 2/20/21
 */

import java.util.Scanner;
public class CircuitAI {
    public int getFirstSwitchState() {
        return 1;
    }

    public int getSecondSwitchState() {
        return 0;
    }

    public int getLampState() {
        if ((getFirstSwitchState() == 1) || (getSecondSwitchState() == 1)) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
