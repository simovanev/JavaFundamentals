package fundamentalsBasikSintax;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String attempt = scanner.nextLine();
        int length = user.length();
        char password = ' ';
        char log = ' ';
        int counter = 0;
        boolean yes = false;
        int correct = 1;
        while (counter < 4) {
            if (length == attempt.length()) {
                correct = 0;
                for (int i = length - 1; i >= 0; i--) {
                    password = user.charAt(i);
                    log = attempt.charAt(length - 1 - i);
                    if (password != log) {
                        correct++;
                    }
                }
            }
            counter++;
            if (correct == 0 ) {
                yes = true;
                break;
            } else if (counter==4) {
                break;

            }
            System.out.println("Incorrect password. Try again.");
            attempt = scanner.nextLine();
        }
        if (yes) {
            System.out.printf("User %s logged in.", user);
        } else System.out.printf("User %s blocked!", user);
    }
}