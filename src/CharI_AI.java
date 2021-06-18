/**
 * Write a description of class CharA_NLee here.
 *
 * @author Aryan Inamdar
 * @version 05-02-21
 */

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class CharI_AI { // drawing 1st letter of last name: I
    private int[] x, y;
    private Point2D.Double[] points;
    private Line2D.Double[] lines;

    public CharI_AI(int xLeft, int yTop)
    {
        x = new int[4];
        y = new int[4];
        points = new Point2D.Double[4];
        lines = new Line2D.Double[4];

        x[0] = xLeft;
        y[0] = yTop;
        points[0] = new Point2D.Double(x[0], y[0]);
    }

    // method to draw
    public void draw(Graphics2D g2)
    {
        x[1] = x[0] + 10;
        y[1] = y[0];
        points[1] = new Point2D.Double(x[1], y[1]);

        x[2] = x[1];
        y[2] = y[1] + 55;
        points[2] = new Point2D.Double(x[2], y[2]);

        x[3] = x[0];
        y[3] = y[2];
        points[3] = new Point2D.Double(x[3], y[3]);

        lines[0] = new Line2D.Double(points[0], points[1]);
        lines[1] = new Line2D.Double(points[1], points[2]);
        lines[2] = new Line2D.Double(points[2], points[3]);
        lines[3] = new Line2D.Double(points[3], points[0]);

        for (int i = 0; i < 4; i++) {
            g2.draw(lines[i]);
        }
    }
}
