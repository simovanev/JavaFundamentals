package fundamentalsBasikSintax;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double total=0;
        for (int i = 0; i < n; i++) {
            double prise = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int count = Integer.parseInt(scanner.nextLine());
            total+=days*prise*count;
            System.out.printf("The price for the coffee is: $%.2f\n",days*prise*count);

        }
        System.out.printf("Total: $%.2f",total);
    }
}

