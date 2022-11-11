package textProcessing;

import java.util.Calendar;
import java.util.Scanner;

public class digitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (char symbol : word.toCharArray()) {
            if (Character.isLetter(symbol)) {
                letter.append(symbol);
            } else if (Character.isDigit(symbol)) {

                digit.append(symbol);
            } else others.append(symbol);

        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(others);

    }
}
