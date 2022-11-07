package methods;

import java.util.Scanner;

public class charInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        charsInBetween(first, second);
    }

    public static void charsInBetween(char star, char end) {

        if (star < end) {
            for (char i = (char)(star + 1); i < (char)end; i++) {

                System.out.print(i + " ");
            }
        } else if (star > end) {
            for (char i = (char) (end + 1); i < (char)star; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
