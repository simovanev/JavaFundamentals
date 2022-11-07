package dataTypesAndVariables;

import java.util.Scanner;

public class concatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String arrow = scanner.nextLine();
        System.out.printf("%s%s%s",firstName,arrow,lastName);
    }
}
