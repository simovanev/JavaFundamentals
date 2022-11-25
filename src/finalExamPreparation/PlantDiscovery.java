package finalExamPreparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> flowersRarity = new LinkedHashMap<>();

        Map<String, Double> flowerRating = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String flower = input[0];
            int rarity = Integer.parseInt(input[1]);
            flowersRarity.put(flower, rarity);

            flowerRating.put(flower, 0.0);
        }
        String changes = scanner.nextLine();

        while (!changes.equals("Exhibition")) {
            String[] action = changes.split("[: -]+");
            String command = action[0];
            String plant = action[1];
            if (flowersRarity.containsKey(plant)) {


                switch (command) {
                    case "Rate":
                        double rating = Integer.parseInt(action[2]);
                        if (flowerRating.get(plant)==0){
                        flowerRating.put(plant, rating);

                        }else flowerRating.put(plant,(flowerRating.get(plant)+ rating)/2);



                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(action[2]);
                        flowersRarity.put(plant, newRarity);
                        break;
                    case "Reset":
                        flowerRating.put(plant, 0.0);
                        break;
                }
            }else  System.out.println("error");
            changes = scanner.nextLine();
        }




        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> item : flowersRarity.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", item.getKey(), item.getValue(),
                    flowerRating.get(item.getKey()));
        }

    }
}
