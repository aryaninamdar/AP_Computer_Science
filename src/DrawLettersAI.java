/**
 *
 *
 * @author Aryan Inamdar
 * @version 05-02-21
 */

import javax.swing.*;

public class DrawLettersAI {
    public static void main(String[] args) {
        DrawLettersAI drawLettersAI = new DrawLettersAI();
        drawLettersAI.viewer();
    }


    public void viewer( )
    {
        JFrame frame = new JFrame();

        frame.setSize(1000, 1000);
        frame.setTitle("Aryan Inamdar - Task #2: Array of Objects");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LettersComponentAI component = new LettersComponentAI();
        frame.add(component);

        frame.setVisible(true);
    }
}
