package textProcessing;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int digit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number.length() - 1; i++) {
            char item = number.toCharArray()[ (number.length() - 1)-i];
            String multiplication = (int)item * digit + "";
            char result= multiplication.toCharArray()[0];
        }


    }
}
