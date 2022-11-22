package regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<name>[A-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*?!(?<attack>[AD])![^@\\-!:>]*->(?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> attackPlanets = new ArrayList<>();
        List<String> defendPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            int decoder = 0;
            for (char symbol : code.toLowerCase().toCharArray()) {
                if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r') {
                    decoder++;
                }
            }
            StringBuilder message = new StringBuilder();
            for (char symbol : code.toCharArray()) {
                char newChar = (char) (symbol - decoder);
                message.append(newChar);
            }
            Matcher matcher = pattern.matcher(message);
            if (matcher.find()) {
                String planet = matcher.group("name");
                int population = Integer.parseInt(matcher.group("population"));
                String attack = matcher.group("attack");
                int count = Integer.parseInt(matcher.group("count"));

                if (attack.equals("A")) {
                    attackPlanets.add(planet);
                } else if (attack.equals("D")) {
                    defendPlanets.add(planet);
                }
            }
        }
        Collections.sort(attackPlanets);
        Collections.sort(defendPlanets);

        System.out.printf("Attacked planets: %d\n", attackPlanets.size());
        if (attackPlanets.size() > 0) {

            for (String item : attackPlanets) {
                System.out.println("-> " + item);
            }
        }
            System.out.printf("Destroyed planets: %d\n", defendPlanets.size());
            if (defendPlanets.size() > 0) {

                for (String item : defendPlanets) {
                    System.out.println("-> " + item);
                }

            }
        }
    }
