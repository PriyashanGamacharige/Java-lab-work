package Q_07;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        String timeString = now.format(formatter);

        JFrame frame = new JFrame(timeString);

        frame.setSize(400, 300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
