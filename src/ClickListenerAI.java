/**
 *
 *
 * @author Aryan Inamdar
 * @version 5/8/21
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 An action listener that prints a message.
 */

public class ClickListenerAI implements ActionListener
{
    private int count;

    // constructor
    public ClickListenerAI()
    {
        count = 0;
    }

    public void actionPerformed(ActionEvent event)
    {
        count++;

        if (count == 1)
            System.out.println("I was clicked 1 time!");
        else
            System.out.println("I was clicked " + count + " times!");
    }
}
