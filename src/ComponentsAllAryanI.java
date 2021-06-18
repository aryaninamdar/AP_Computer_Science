/**
 * This viewer constructs the car and flag objects.
 *
 * @author Aryan Inamdar
 * @version 02-27-21
 */

import javax.swing.*;
import java.awt.*;

public class ComponentsAllAryanI extends JComponent {
    private Graphics2D g2;
    public void paintComponent(Graphics g) {
        g2 = (Graphics2D) g;
        CarAI car = new CarAI(0, 0);
        car.draw(g2);

        int x = getWidth() - 60;
        int y = getHeight() - 30;
        CarAI car2 = new CarAI(x, y);
        car2.draw(g2);

        ItalianFlagAI flag = new ItalianFlagAI(100, 100, 90);
        flag.draw(g2);
    }
}
