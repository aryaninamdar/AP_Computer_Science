/**
 *
 *
 * @author Aryan Inamdar
 * @version 05-02-21
 */

import java.awt.*;
import javax.swing.JComponent;

public class LettersComponentAI extends JComponent
{
    private Graphics2D g2;
    public void paintComponent(Graphics g) {
        g2 = (Graphics2D) g;
        // first letter
        CharI_AI charI_ai = new CharI_AI(420, 50);
        charI_ai.draw(g2);

        // second letter
        CharN_AI charN_ai = new CharN_AI(470, 50);
        charN_ai.draw(g2);

        // third letter
        CharA_AI charA_ai = new CharA_AI(540, 50);
        charA_ai.draw(g2);
    }
}