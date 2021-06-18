/**
 *
 *
 * @author Aryan Inamdar
 * @version 5/8/21
 */

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrClientAI
{
    public static void main(String[] args) {
        GrClientAI grClientAI = new GrClientAI();
        grClientAI.test2();
    }

    public static void test1()
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Aryan Inamdar"); //qqq add YI
        frame.add(button);

        ActionListener listener = new ClickListenerAI();
        button.addActionListener(listener);

        frame.setSize(300, 300); //qqq which is width/height? change it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     This program displays a list of rectangles
     that can be added to with the mouse.
     */
    public static void test2( )
    {
        JFrame frame = new FrameExampleAI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }



}

