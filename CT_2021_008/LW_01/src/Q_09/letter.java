package Q_09;

import java.util.Scanner;

public class letter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();

        char fristChar = input.charAt(0);
        char lastChar  = input.charAt(length - 1);

        System.out.println(length);
        System.out.println(fristChar);
        System.out.println(lastChar);

        scanner.close();

    }
}
