/**
 *
 *
 * @author Aryan Inamdar
 * @version 5/8/21
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 This component qqq
 */
public class ComponentExAI extends JComponent
{

    public ComponentExAI()
    {

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

    }

    /**
     @param x the x-position of the new location
     @param y the y-position of the new location
     */
    public void whereAmI(int x, int y)
    {
        System.out.println("x: "+ x + ", y: "+ y);
    }
}
