package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String goods = scanner.nextLine();
        List<String> boughtGoodsList = new ArrayList<>();
        double totalSpent = 0;
        Pattern pattern = Pattern.compile(">>(?<item>[A-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)");
        while (!goods.equals("Purchase")) {

            Matcher matcher = pattern.matcher(goods);
            if (matcher.find()) {

            boughtGoodsList.add(matcher.group("item"));
            double price = Double.parseDouble(matcher.group("price"));
            int quantity = Integer.parseInt(matcher.group("quantity"));
            totalSpent += price * quantity;
        }
            goods = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String element : boughtGoodsList) {
            System.out.println(element);
        }
        System.out.printf("Total money spend: %.2f", totalSpent);
    }
}
