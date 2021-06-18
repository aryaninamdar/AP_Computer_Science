/**
 * This viewer displays both objects in the frame
 *
 * @author Aryan Inamdar
 * @version 02-27-21
 */

import javax.swing.*;

public class ClientViewerAryanI {
    public static void main(String[] args) {
        ClientViewerAryanI clientViewerAryanI = new ClientViewerAryanI();
        clientViewerAryanI.viewer();
    }


    public void viewer() {
        JFrame frame = new JFrame();

        frame.setSize(640, 480);
        frame.setTitle("Aryan Inamdar - All Components Client Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ComponentsAllAryanI component = new ComponentsAllAryanI();
        frame.add(component);

        frame.setVisible(true);
    }
}
