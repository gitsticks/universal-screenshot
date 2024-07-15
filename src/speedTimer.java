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

    long secondsWrite = 0;
    int millisecondsWrite = 0;
    int minutesWrite = 0;

    long startTime = System.nanoTime();
    long currentTime = 0;
    long currentMilliTime = 0;
    emptyLabel.setFont(new Font("Serif", Font.PLAIN, 100));
    while(true) {


        currentTime = System.nanoTime() - startTime;
        currentMilliTime = currentTime / 1000000;

        secondsWrite = currentMilliTime / 1000;

        toWrite =
                currentMilliTime/60000 + ":" +
                currentMilliTime/1000 + ":" +
                currentMilliTime;

        emptyLabel.setText(toWrite);
        counter++;

        try { TimeUnit.MILLISECONDS.sleep(1);
        } catch(InterruptedException e)
        {System.out.println(e);}
    }

    }

}
