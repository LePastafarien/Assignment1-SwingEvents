package gui_swing_events;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingEventWindow extends JFrame {
    /*
     * Adding the class instances:
     */
    // Just declaring all the components to be used in the JFrame:
    // Create JPanel container object:
    JPanel pnl = new JPanel();

    /*
     * Creating the Constructor method to specify the Swing Window Requirements
     * and adding JPanel object to the JFrame
     * The constructor should include statements
     * to set these minimum requirements:
     */

    public SwingEventWindow() {
        // we used => new JFrame("the window title")
        // we don't use this syntax: JFrame frame = new JFrame("Title");
        // since we extended the JFrame Class
        // instead, we use super() method:
        /*
         * Passing the String title
         * to the inherited super() method
         * of the the "JFrame" class
         */
        super("GUI Swing Window");
        // The other way of adding a title:
        setTitle("GUI Swing Window");

        // instead of using the object "frame" => frame.setSize(500, 200);
        setSize(500, 200);
        // instead frame.setVisible(true);
        setVisible(true);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Adding the JPanel object to the JFrame:
        add(pnl);
    } // end constructor
}