package Q_04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class date {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");

        System.out.println("Today's Date: " + today.format(formatter));
    }
}
