package fundamentalsBasikSintax;

import java.util.Scanner;

public class gamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double spent=0;
        while (!game.equals("Game Time")) {

            switch (game) {
                case "OutFall 4":
                    if (balance >= 39.99) {
                        balance -= 39.99;
                        spent+=39.99;
                        System.out.println("Bought OutFall 4");
                    }else System.out.println("Too Expensive");
                    break;
                case "CS: OG":
                    if (balance >= 15.99) {
                        balance -= 15.99;
                        spent+=15.99;
                        System.out.println("Bought CS: OG");
                    }else System.out.println("Too Expensive");
                    break;
                case "Zplinter Zell":
                    if (balance >= 19.99) {
                        balance -= 19.99;
                        spent+=19.99;
                        System.out.println("Bought Zplinter Zell");
                    }else System.out.println("Too Expensive");
                    break;
                case "Honored 2":
                    if (balance >= 59.99) {
                        balance -= 59.99;
                        spent+=59.99;
                        System.out.println("Bought Honored 2");
                    }else System.out.println("Too Expensive");
                    break;
                case "RoverWatch":
                    if (balance >= 29.99) {
                        balance -= 29.99;
                        spent+=29.99;
                        System.out.println("Bought RoverWatch");
                    }else System.out.println("Too Expensive");
                    break;
                case "RoverWatch Origins Edition":
                    if (balance >= 39.99) {
                        balance -= 39.99;
                        spent+=39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }else System.out.println("Too Expensive");
                    break;
                default:
                    System.out.println("Not Found");
                    break;

            }
            if (balance==0){
                System.out.println("Out of money");
                break;
            }
            game = scanner.nextLine();
        }
        if (balance>0){
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spent,balance);

        }
    }
}
