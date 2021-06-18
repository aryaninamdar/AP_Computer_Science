/**
 *
 * @author Aryan Inamdar
 * @version 3/20/21
 */

import javax.swing.*;
import java.awt.Rectangle;

public class CarClientAI {
    public static void main(String[] args) {
        CarClientAI ch02GraphicsAI = new CarClientAI();
        ch02GraphicsAI.viewer();
    }


    public void viewer( )
    {
        JFrame frame = new JFrame();

        frame.setSize(640, 480);
        frame.setTitle("Aryan Inamdar - 21_0225a Swing Graphics Two Cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarComponentAI component = new CarComponentAI();
        frame.add(component);

        frame.setVisible(true);
    }
}
