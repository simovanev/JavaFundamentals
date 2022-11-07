package fundamentalsBasikSintax;

import java.util.Scanner;

public class englishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int digit = number % 10;
        String english = "";
        switch (digit) {
            case 0:
                english = "zero";
                break;
            case 1:
                english = "one";
                break;
            case 2:
                english = "two";
                break;
            case 3:
                english = "three";
                break;
            case 4:
                english = "four";
                break;
            case 5:
                english = "five";
                break;
            case 6:
                english = "six";
                break;
            case 7:
                english = "seven";
                break;
            case 8:
                english = "eight";
                break;
            case 9:
                english = "nine";
                break;
        }
        System.out.println(english);
    }
}
