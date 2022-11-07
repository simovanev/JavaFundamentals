package methods;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (length(password) && digitsAndLetters(password) && twoDigits(password)) {
            System.out.println("Password is valid");
        }
        if (!length(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!digitsAndLetters(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!twoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean length(String text) {
        if (text.length() >= 6 && text.length() <= 10) {
            return true;
        }
        return false;
    }

    public static boolean digitsAndLetters(String text) {
        boolean isPassword = false;
        for (char item : text.toCharArray()) {
            if ((item >= '0' && item <= '9') || (item >= 'A' && item <= 'Z') || (item >= 'a' && item <= 'z')) {
                isPassword = true;
            } else {
                return false;
            }
        }
        return isPassword;
    }

    public static boolean twoDigits(String text) {
        int counter = 0;
        for (int item : text.toCharArray()) {
            if (item >= '0' && item <= '9') {
                counter++;
            }

        }
        if (counter >= 2) {
            return true;
        }
        return false;
    }


}
