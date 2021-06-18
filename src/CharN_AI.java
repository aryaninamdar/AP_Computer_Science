/**
 * Write a description of class CharA_NLee here.
 *
 * @author Aryan Inamdar
 * @version 05-02-21
 */

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class CharN_AI { // drawing 2nd letter of last name: N
    private int[] x, y;
    private Point2D.Double[] points;
    private Line2D.Double[] lines;

    public CharN_AI(int xLeft, int yTop)
    {
        x = new int[10];
        y = new int[10];
        points = new Point2D.Double[10];
        lines = new Line2D.Double[11];

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

        x[2] = x[1] + 20;
        y[2] = y[1] + 45;
        points[2] = new Point2D.Double(x[2], y[2]);

        x[3] = x[2] + 20;
        y[3] = y[1];
        points[3] = new Point2D.Double(x[3], y[3]);

        x[4] = x[3] + 10;
        y[4] = y[3];
        points[4] = new Point2D.Double(x[4], y[4]);

        x[5] = x[2] + 5;
        y[5] = y[2] + 10;
        points[5] = new Point2D.Double(x[5], y[5]);

        x[6] = x[2] - 5;
        y[6] = y[5];
        points[6] = new Point2D.Double(x[6], y[6]);

        x[7] = x[1] - 5;
        y[7] = y[6] - 45;
        points[7] = new Point2D.Double(x[7], y[7]);

        x[8] = x[7] - 25;
        y[8] = y[5];
        points[8] = new Point2D.Double(x[8], y[8]);

        x[9] = x[8] - 10;
        y[9] = y[8];
        points[9] = new Point2D.Double(x[9], y[9]);

        lines[0] = new Line2D.Double(points[0], points[1]);
        lines[1] = new Line2D.Double(points[1], points[2]);
        lines[2] = new Line2D.Double(points[2], points[3]);
        lines[3] = new Line2D.Double(points[3], points[4]);
        lines[4] = new Line2D.Double(points[3], points[4]);
        lines[5] = new Line2D.Double(points[4], points[5]);
        lines[6] = new Line2D.Double(points[5], points[6]);
        lines[7] = new Line2D.Double(points[6], points[7]);
        lines[8] = new Line2D.Double(points[7], points[8]);
        lines[9] = new Line2D.Double(points[8], points[9]);
        lines[10] = new Line2D.Double(points[9], points[0]);

        for (int i = 0; i < 11; i++) {
            g2.draw(lines[i]);
        }
    }
}