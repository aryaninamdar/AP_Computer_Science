/**
 *
 *
 * @author Aryan Inamdar
 * @version 5/8/21
 */

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class FrameExampleAI extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private ComponentExAI scene;

    //This is an "inner class" pg qqq
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            scene.whereAmI(x, y);
        }

        // Do-nothing methods
        public void mouseReleased(MouseEvent event)
        {
        }

        public void mouseClicked(MouseEvent event)
        {
        }

        public void mouseEntered(MouseEvent event)
        {
        }

        public void mouseExited(MouseEvent event)
        {
        }
    }

    public FrameExampleAI()
    {
        scene = new ComponentExAI();
        add(scene);

        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}
