package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class legendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> farmMap = new LinkedHashMap<>();

        farmMap.put("shards", 0);
        farmMap.put("fragments", 0);
        farmMap.put("motes", 0);
        LinkedHashMap<String, Integer> junk = new LinkedHashMap<>();
        String[] input = scanner.nextLine().split("\\s+");
        boolean win = false;
        for (int i = 0; i < input.length - 1; i++) {
            if (i % 2 == 0) {
                int points = 0;
                String material = "";
                points = Integer.parseInt(input[i]);
                material = input[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {

                    if (!win) {
                        farmMap.put(material, farmMap.get(material) + points);
                    }

                    if (farmMap.get("shards") >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        farmMap.put("shards", farmMap.get("shards") - 250);
                        win = true;

                    } else if (farmMap.get("fragments") >= 250) {
                        System.out.println("Valanyr obtained!");
                        farmMap.put("fragments", farmMap.get("fragments") - 250);
                        win = true;

                    } else if (farmMap.get("motes") >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        farmMap.put("motes", farmMap.get("motes") - 250);
                        win = true;
                    }


                } else {
                    junk.putIfAbsent(material, 0);
                    junk.put(material, junk.get(material) + points);
                }
            }
        }
        for (Map.Entry<String, Integer> element : farmMap.entrySet()) {
            System.out.println(element.getKey() + ": " + element.getValue());
        }
        for (Map.Entry<String, Integer> item : junk.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }


    }

}



