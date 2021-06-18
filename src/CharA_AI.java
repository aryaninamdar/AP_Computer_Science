/**
 * Write a description of class CharA_NLee here.
 *
 * @author Aryan Inamdar
 * @version 05-02-21
 */

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

public class CharA_AI // drawing 3rd letter of last name: A
{
    private int[] x1, x2, y1, y2;
    private Point2D.Double[] pointsA1, pointsA2;
    private Line2D.Double[] linesA1, linesA2;

    public CharA_AI()
    {
        x1 = new int[8];
        x2 = new int[3];
        y1 = new int[8];
        y2 = new int[3];
        pointsA1 = new Point2D.Double[8];
        pointsA2 = new Point2D.Double[3];
        linesA1 = new Line2D.Double[8];
        linesA2 = new Line2D.Double[3];
    }

    public CharA_AI(int xLeft, int yTop)
    {
        x1 = new int[8];
        x2 = new int[3];
        y1 = new int[8];
        y2 = new int[3];
        pointsA1 = new Point2D.Double[8];
        pointsA2 = new Point2D.Double[3];
        linesA1 = new Line2D.Double[8];
        linesA2 = new Line2D.Double[3];

        x1[0] = xLeft + 15;
        x2[0] = xLeft + 20;
        y1[0] = yTop;
        y2[0] = yTop + 15;
        pointsA1[0] = new Point2D.Double(x1[0], y1[0]);
        pointsA2[0] = new Point2D.Double(x2[0], y2[0]);
    }

    // method to draw
    public void draw(Graphics2D g2)
    {
        x1[1] = x1[0] + 10;    y1[1] = y1[0];
        x1[2] = x1[1] + 15;    y1[2] = y1[1] + 55;
        x1[3] = x1[2] - 10;    y1[3] = y1[2];
        x1[4] = x1[3] -  5;    y1[4] = y1[3] - 15;
        x1[5] = x1[4] - 10;    y1[5] = y1[4];
        x1[6] = x1[5] -  5;    y1[6] = y1[5] + 15;
        x1[7] = x1[6] - 10;    y1[7] = y1[6];

        x2[1] = x2[0] +  5;    y2[1] = y2[0] + 15;
        x2[2] = x2[1] - 10;    y2[2] = y2[1];

        for(int i = 1; i < 8; i++)
        {
            pointsA1[i] = new Point2D.Double(x1[i], y1[i]);
            linesA1[i - 1] = new Line2D.Double(pointsA1[i - 1], pointsA1[i]);
        }
        linesA1[7] = new Line2D.Double(pointsA1[7], pointsA1[0]);

        pointsA2[0] = new Point2D.Double(x2[0], y2[0]);
        pointsA2[1] = new Point2D.Double(x2[1], y2[1]);
        linesA2[0]  = new Line2D.Double(pointsA2[0], pointsA2[1]);
        pointsA2[2] = new Point2D.Double(x2[2], y2[2]);
        linesA2[1] = new Line2D.Double(pointsA2[1], pointsA2[2]);
        linesA2[2] = new Line2D.Double(pointsA2[2], pointsA2[0]);

        for(int i = 0; i < 8; i++)
        {
            g2.draw(linesA1[i]);
        }
        for(int i = 0; i < 3; i++)
        {
            g2.draw(linesA2[i]);
        }
    }
}
