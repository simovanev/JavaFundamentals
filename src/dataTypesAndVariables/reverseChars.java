package dataTypesAndVariables;

import java.util.Scanner;

public class reverseChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);
        System.out.printf("%s %s %s", third,second,first);
    }
}
