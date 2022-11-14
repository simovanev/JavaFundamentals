package textProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder outcome = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) != input.charAt(i + 1)) {
                outcome.append(input.charAt(i));
            }
        }
        outcome.append(input.charAt(input.length() - 1));
        System.out.println(outcome);
    }
}
