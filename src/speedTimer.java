import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;


public class speedTimer {

    public speedTimer() {


    JFrame frame = new JFrame("FrameDemo");

    JFrame.setDefaultLookAndFeelDecorated(true);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Label emptyLabel = new Label("initialising...");

    frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

    frame.pack();

    frame.setVisible(true);

    int counter = 0;

    while(true) {

        emptyLabel.setText(Integer.toString(counter));

        counter++;

        try { TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException e)
        {System.out.println(e);}
    }

    }

}
