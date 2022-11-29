package finalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> populationMap = new LinkedHashMap<>();
        Map<String, Integer> goldMap = new LinkedHashMap<>();
        String treasure = scanner.nextLine();
        while (!treasure.equals("Sail")) {

            String city = treasure.split("\\|{2}")[0];
            int population = Integer.parseInt(treasure.split("\\|{2}")[1]);
            int gold = Integer.parseInt(treasure.split("\\|{2}")[2]);
            populationMap.putIfAbsent(city, 0);
            goldMap.putIfAbsent(city, 0);
            populationMap.put(city, populationMap.get(city) + population);
            goldMap.put(city, goldMap.get(city) + gold);
            treasure = scanner.nextLine();
        }
        String events = scanner.nextLine();
        while (!events.equals("End")) {

            if (events.contains("Plunder")) {
                String cityAttacked = events.split("=>")[1];
                int peopleKilled = Integer.parseInt(events.split("=>")[2]);
                int goldStilled = Integer.parseInt(events.split("=>")[3]);
                int cityPopulation = populationMap.get(cityAttacked);
                int cityGold = goldMap.get(cityAttacked);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n"
                        , cityAttacked
                        , Math.min(goldStilled, cityGold)
                        , Math.min(peopleKilled, cityPopulation));
                if (peopleKilled >= cityPopulation || goldStilled >= cityGold) {
                    System.out.printf("%s has been wiped off the map!\n", cityAttacked);
                    populationMap.remove(cityAttacked);
                    goldMap.remove(cityAttacked);
                } else {
                    populationMap.put(cityAttacked, populationMap.get(cityAttacked) - peopleKilled);
                    goldMap.put(cityAttacked, goldMap.get(cityAttacked) - goldStilled);
                }
            } else if (events.contains("Prosper")) {
                String cityProsper = events.split("=>")[1];
                int goldProsper = Integer.parseInt(events.split("=>")[2]);
                int cityCurrentGold=goldMap.get(cityProsper);

                if (goldProsper < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                }else {
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n"
                    ,goldProsper
                    ,cityProsper
                    ,goldProsper+cityCurrentGold);
                    goldMap.put(cityProsper,cityCurrentGold+goldProsper);
                }
            }


            events = scanner.nextLine();
        }
        if (!populationMap.isEmpty()){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n",populationMap.size());
            for (Map.Entry<String, Integer> item : populationMap.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n"
                ,item.getKey()
                ,item.getValue()
                ,goldMap.get(item.getKey()));
            }

        }else System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
    }
}
