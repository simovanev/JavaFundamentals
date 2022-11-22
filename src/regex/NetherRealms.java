package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(",\\s+");
        String health = "[^\\d*+\\-,*/.]";
        String damage = "[+\\-]?\\d\\.?\\d*";
        Pattern patternHealth = Pattern.compile(health);
        Pattern patternDamage = Pattern.compile(damage);
        for (int i = 0; i < names.length; i++) {
        int healthPower = 0;
        double damagePower = 0;
            String name = names[i].replaceAll(" ","");

            Matcher matcherHealth = patternHealth.matcher(name);
            while (matcherHealth.find()) {
                char[] element = matcherHealth.group().toCharArray();
                for (char item : element) {
                    healthPower += item;

                }
            }
            Matcher matcherDamage = patternDamage.matcher(name);
            while (matcherDamage.find()) {
                double power = Double.parseDouble(matcherDamage.group());
                damagePower += power;
            }
            String action = "[/*]";
            Pattern multiplier = Pattern.compile(action);
            Matcher matcher = multiplier.matcher(name);
            while (matcher.find()) {
                if (matcher.group().equals("/")) {
                    damagePower = damagePower / 2;
                } else if (matcher.group().equals("*")) {
                    damagePower = damagePower * 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage\n", name, healthPower, damagePower);
        }
    }
}
