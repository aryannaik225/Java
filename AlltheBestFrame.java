import java.awt.*;
import java.awt.event.*;


public class AlltheBestFrame extends Frame{
    AlltheBestFrame()
    {
        setTitle("Display Message");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        setSize(300, 150);

        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("All the Best", 100, 80);
    }

    public static void main(String[] args) {
        new AlltheBestFrame();
    }
    
}