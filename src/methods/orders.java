package methods;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String beverage= scanner.nextLine();
        int numbers=Integer.parseInt(scanner.nextLine());
        orderTotal(beverage,numbers);

    }
    private static void orderTotal(String drink, int quantity){
        switch (drink){

            case "coffee":
                System.out.printf("%.2f",1.5*quantity);
                break;
            case "water":
                System.out.printf("%.2f",1.0*quantity);
                break;
            case "coke":
                System.out.printf("%.2f",1.4*quantity);
                break;
            case "snacks":
                System.out.printf("%.2f",2.0*quantity);
                break;


        }
    }
}
