package midExam;

import java.util.Scanner;

public class midExam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCities = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;
        for (int i = 1; i <= numberOfCities; i++) {
            String cityName = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            double profit = income - expenses;
            if (i % 5 == 0) {
                profit = income * 0.9-expenses;
            } else if (i % 3 == 0) {
                profit = income - expenses * 1.5;
            }
            totalProfit += profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.\n", cityName, profit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.",totalProfit);
    }
}
