package finalExamPreparation;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            if (command.contains("InsertSpace")) {
                int index = Integer.parseInt(command.split(":\\|:")[1]);
                message.insert(index, " ");
                System.out.println(message);
            } else if (command.contains("Reverse")) {
                String substring=command.split(":\\|:")[1];
                if (message.toString().contains(substring)){
                    message=new StringBuilder(message.toString().replaceFirst(substring,""));
                    StringBuilder newSubstring=new StringBuilder(substring);
                    newSubstring.reverse();
                    message.append(newSubstring);
                    System.out.println(message);
                }else System.out.println("error");

            } else if (command.contains("ChangeAll")) {
                String substring=command.split(":\\|:")[1];
                String replacement=command.split(":\\|:")[2];
                while (message.toString().contains(substring)){
                    message=new StringBuilder(message.toString().replace(substring,replacement));
                }
                System.out.println(message);

            }


            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",message);
    }
}
