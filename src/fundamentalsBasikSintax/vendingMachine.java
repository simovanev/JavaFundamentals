package fundamentalsBasikSintax;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String money = scanner.nextLine();
        double cash = 0;
        while (!money.equals("Start")) {
            double coins = Double.parseDouble(money);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                cash += coins;

            } else System.out.printf("Cannot accept %.2f\n", coins);
            money = scanner.nextLine();

        }
        String order = scanner.nextLine();
        while (!order.equals("End")) {

            switch (order) {
                case "Nuts":
                    if (cash >= 2) {
                        cash -= 2;
                        System.out.println("Purchased Nuts");
                    }else System.out.println("Sorry, not enough money");
                    break;
                case "Water":
                    if (cash >= 0.7) {
                        cash -= 0.7;
                        System.out.println("Purchased Water");
                    }else System.out.println("Sorry, not enough money");
                    break;
                case "Crisps":
                    if (cash >= 1.5) {
                        cash -= 1.5;
                        System.out.println("Purchased Crisps");
                    }else System.out.println("Sorry, not enough money");
                    break;
                case "Soda":
                    if (cash >= 0.8) {
                        cash -= 0.8;
                        System.out.println("Purchased Soda");
                    }else System.out.println("Sorry, not enough money");
                    break;
                case "Coke":
                    if (cash >= 1) {
                        cash -= 1;
                        System.out.println("Purchased Coke");
                    }else System.out.println("Sorry, not enough money");
                    break;
                default:
                    System.out.println("Invalid product");
                    break;

            }

            order = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", cash);
    }
}
