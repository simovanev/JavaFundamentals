package finalExamPreparation;

import java.util.Scanner;

public class passwordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder password = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String action = command.split(" ")[0];
            StringBuilder newPassword = new StringBuilder();
            switch (action) {
                case "TakeOdd":
                    for (int i = 0; i < password.length(); i++) {
                        char symbol = password.charAt(i);
                        if (i % 2 != 0) {
                            newPassword.append(symbol);
                        }
                    }
                    password = newPassword;
                    System.out.println(password);

                    break;
                case "Cut":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int length = Integer.parseInt(command.split(" ")[2]);
                    int endIndex = index + length;
                    password.replace(index, endIndex, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String toBeReplaced=command.split(" ")[1];
                    String toReplaceWith=command.split(" ")[2];
                    if (password.toString().contains(toBeReplaced)){

                    while (password.toString().contains(toBeReplaced)){
                        String newWord= password.toString().replace(toBeReplaced,toReplaceWith);
                      password= new StringBuilder(newWord);
                    }
                    System.out.println(password);
                    }else System.out.println("Nothing to replace!");
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println("Your password is: "+password);

    }
}
