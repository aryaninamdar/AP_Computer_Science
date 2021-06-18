/**
 *
 * @author Aryan Inamdar
 * @version 3/20/21
 */

//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Rectangle;
//import java.awt.Font;
import java.awt.*;

//import java.awt.geom.Ellipse2D;
//import java.awt.geom.Line2D;
import java.awt.geom.*;
import javax.swing.JComponent;
import java.util.Random;
/*
A component that draws an alien face
 */
public class CarComponentAI extends JComponent
{
    private Graphics2D g2;
    public void paintComponent(Graphics g) {
        g2 = (Graphics2D) g;
        CarAI car1 = new CarAI(0, 0);
        // This statement is dynamic as it will always position
        // the second car at the bottom right of the screen,
        // even when it is resized
        int x = getWidth() - 60;
        int y = getHeight() - 30;

        // printing coordinates of second car
        System.out.println("x: " + x + ", y: " + y);

        CarAI car2 = new CarAI(x, y);
        car1.draw(g2);
        car2.draw(g2);
    }
}
