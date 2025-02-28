package Q_10;

import java.util.Scanner;

public class middle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd length word: ");
        String input = scanner.nextLine();

        if (input.length()% 2==1){
            char middleChar = input.charAt(input.length()/2);
            System.out.println(middleChar);
        }else {
            System.out.println("Enter a word with an odd number of characters");
        }
        scanner.close();
    }
}
