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

    String toWrite = "init...";

    int secondsWrite = 0;
    int millisecondsWrite = 0;
    int minutesWrite = 0;

    while(true) {

        emptyLabel.setFont(new Font("Serif", Font.PLAIN, 100));

        toWrite = Integer.toString(minutesWrite) + ":" + Integer.toString(secondsWrite) + ":" +  Integer.toString(millisecondsWrite);
        emptyLabel.setText(toWrite);
        counter++;

        secondsWrite = counter /1000;
        minutesWrite = secondsWrite / 60;
        millisecondsWrite = Math.abs(counter) % 1000;

        try { TimeUnit.MILLISECONDS.sleep(1);
        } catch(InterruptedException e)
        {System.out.println(e);}
    }

    }

}
