/**
 * This component draws an Italian flag.
 *
 * @author Aryan Inamdar
 * @version 02-27-21
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class ItalianFlagComponentAI extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        ItalianFlagAI flag = new ItalianFlagAI(100, 100, 90);
        flag.draw(g2);

    }
}
