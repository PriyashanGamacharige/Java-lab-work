package Q_11;

import java.util.Scanner;

public class nameformat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name (First Middle Last): ");
        String fristName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();

        System.out.println(lastName + ","+fristName+" "+middleName.charAt(0)+ ".");
        scanner.close();
    }
}
