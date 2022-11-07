package dataTypesAndVariables;

import java.util.Scanner;

public class convertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int meters=Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f",meters/1000.0);
    }
}
