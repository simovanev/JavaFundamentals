package associativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        Map<String, Double> priceList = new LinkedHashMap<>();
        Map<String, Integer> quantityList = new LinkedHashMap<>();
        while (!product.equals("buy")) {
            String good = product.split(" ")[0];
            double price = Double.parseDouble(product.split(" ")[1]);
            int quantity = Integer.parseInt(product.split(" ")[2]);
            priceList.put(good, price);
            quantityList.putIfAbsent(good, 0);
            quantityList.put(good, quantityList.get(good) + quantity);


            product = scanner.nextLine();
        }
        for (Map.Entry<String, Double> item : priceList.entrySet()) {
            System.out.printf("%s -> %.2f\n",item.getKey(),item.getValue() * quantityList.get(item.getKey()));
        }

    }
}
