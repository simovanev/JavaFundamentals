package finalExamPreparation;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder key = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String[] sequence = command.split(">>>");
            String action = sequence[0];
            if (action.equals("Contains")) {
                String substring = sequence[1];
                if (key.toString().contains(substring)) {
                    System.out.printf("%s contains %s\n", key, substring);
                } else System.out.println("Substring not found!");

            } else if (action.equals("Flip")) {
                String lowerOrUpper = sequence[1];
                int startIndex = Integer.parseInt(sequence[2]);
                int endIndex = key.length() - 1;
                if (sequence.length == 4) {
                    endIndex = Integer.parseInt(sequence[3]);
                }
                String subText = key.substring(startIndex, endIndex);
                if (lowerOrUpper.equals("Upper")) {
                    String newText = subText.toUpperCase();
                    key.replace(startIndex, endIndex, newText);


                } else if (lowerOrUpper.equals("Lower")) {
                    String newText = subText.toLowerCase();
                    key.replace(startIndex, endIndex, newText);

                }
                System.out.println(key);


            } else if (action.equals("Slice")) {
                int startIndex = Integer.parseInt(sequence[1]);
                int endIndex = key.length() - 1;
                if (sequence.length == 3) {
                    endIndex = Integer.parseInt(sequence[2]);
                }

                key.delete(startIndex, endIndex);
                System.out.println(key);
            }


            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",key);
    }
}
