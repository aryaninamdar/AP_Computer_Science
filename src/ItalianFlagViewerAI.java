/**
 * This viewer displays the Italian flag drawing in a frame.
 *
 * @author Aryan Inamdar
 * @version 02-27-21
 */

import javax.swing.*;
public class ItalianFlagViewerAI {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Aryan Inamdar - 21_0225a Swing Graphics Italian Flag");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ItalianFlagComponentAI component = new ItalianFlagComponentAI();
        frame.add(component);

        frame.setVisible(true);

    }
}
