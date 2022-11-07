package dataTypesAndVariables;

import java.util.Scanner;

public class centuriesToMinutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int centuries=Integer.parseInt(scanner.nextLine());
        System.out.printf
                ("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",
                        centuries,centuries*100.0,centuries*100*365.2422,centuries*100*365.2422*24,
                        centuries*100*365.2422*24*60);
    }
}
