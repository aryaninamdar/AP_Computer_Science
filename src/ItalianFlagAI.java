/**
 * An Italian flag that can be positioned anywhere on the screen.
 *
 * @author Aryan Inamdar
 * @version 02-27-21
 */

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class ItalianFlagAI {
    private int xLeft;
    private int yTop;
    private int width;

    public ItalianFlagAI(int x, int y, int w)
    {
        xLeft = x;
        yTop = y;
        width = w;
    }

    public void draw(Graphics2D g2)
    {
        // The left rectangle of the Italian flag
        Rectangle leftRectangle = new Rectangle(
                xLeft, yTop,
                width / 3, width * 2 / 3);
        // The middle rectangle of the Italian flag
        Rectangle middleRectangle = new Rectangle(
                xLeft + width / 3, yTop,
                width / 3, width * 2 / 3);
        // The right rectangle of the Italian flag
        Rectangle rightRectangle = new Rectangle(
                xLeft + 2 * width / 3, yTop,
                width / 3, width * 2 / 3);

        g2.setColor(Color.GREEN);
        g2.fill(leftRectangle);
        g2.setColor(Color.WHITE);
        g2.fill(middleRectangle);
        g2.setColor(Color.RED);
        g2.fill(rightRectangle);
    }

}
