package finalExamPreparation;

import java.util.Scanner;

public class ActivationKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder key = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String action = command.split(">>>")[0];
            if (action.equals("Contains")) {
                String substring = command.split(">>>")[1];
                if (key.toString().contains(substring)) {
                    System.out.printf("%s contains %s\n", key, substring);
                } else System.out.println("Substring not found!");

            } else if (action.equals("Flip")) {
                String substring = command.split(">>>")[1];
                int startIndex = Integer.parseInt(command.split(">>>")[2]);
                int endIndex = key.length() - 1;
                if (command.length() == 3) {
                    endIndex = Integer.parseInt(command.split(">>>")[3]);
                }
                if (substring.equals("Upper")) {
                    key.substring(startIndex,endIndex).toUpperCase();
                } else if (substring.equals("lower")) {
                    key.substring(startIndex,endIndex).toLowerCase();
                }
                System.out.println(key);


            } else if (action.equals("Slice")) {
                int startIndex = Integer.parseInt(command.split(">>>")[1]);
                int endIndex = key.length() - 1;
                if (command.length() == 2) {
                    endIndex = Integer.parseInt(command.split(">>>")[2]);
                }
                String substring=key.substring(startIndex,endIndex);
                key.delete(startIndex,endIndex);
                System.out.println(key);
            }


            command = scanner.nextLine();
        }
    }
}
