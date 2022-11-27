package finalExamPreparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> hitPower = new LinkedHashMap<>();
        Map<String, Integer> mana =  new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String hero = input.split("\\s+")[0];
            int heroPower = Integer.parseInt(input.split("\\s+")[1]);
            int heroMana = Integer.parseInt(input.split("\\s+")[2]);
            if (heroPower <= 100) {
            hitPower.put(hero, heroPower);

            }
            if (heroMana <= 200) {
            mana.put(hero, heroMana);

            }
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String action = command.split("\\s+-\\s+")[0];
            switch (action) {
                case "CastSpell":
                    String heroName = command.split("\\s+-\\s+")[1];
                    int manaNeeded = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                    String spellName = command.split("\\s+-\\s+")[3];
                    int remainingMana = mana.get(heroName) - manaNeeded;
                    if (remainingMana >= 0) {
                        mana.put(heroName, remainingMana);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName, remainingMana);
                    } else System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    break;
                case "TakeDamage":
                    String heroNameDamage = command.split("\\s+-\\s+")[1];
                    int damage = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                    String attacker = command.split("\\s+-\\s+")[3];
                    int remainingPower = hitPower.get(heroNameDamage) - damage;
                    if (remainingPower > 0) {
                        hitPower.put(heroNameDamage, remainingPower);
                        System.out.printf("%s was hit for %d HP by %s and now has %s HP left!\n",
                                heroNameDamage, damage, attacker, remainingPower);

                    } else {
                        System.out.printf("%s has been killed by %s!\n", heroNameDamage, attacker);
                        hitPower.remove(heroNameDamage);
                        mana.remove(heroNameDamage);
                    }
                    break;
                case "Recharge":
                    String heroNameRecharge = command.split("\\s+-\\s+")[1];
                    int recharge = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                    int totalMana = mana.get(heroNameRecharge) + recharge;
                    if (totalMana >= 200) {
                        System.out.printf("%s recharged for %d MP!\n", heroNameRecharge, 200 - mana.get(heroNameRecharge));
                        mana.put(heroNameRecharge, 200);
                    } else {
                        System.out.printf("%s recharged for %d MP!\n", heroNameRecharge, recharge);
                        mana.put(heroNameRecharge, totalMana);
                    }
                    break;
                case "Heal":
                    String heroNameHeal = command.split("\\s+-\\s+")[1];
                    int heal = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                    int totalHeal = hitPower.get(heroNameHeal) + heal;
                    if (totalHeal >= 100) {
                        System.out.printf("%s healed for %d HP!\n", heroNameHeal, 100 - hitPower.get(heroNameHeal));
                        hitPower.put(heroNameHeal, 100);
                    } else {
                        System.out.printf("%s healed for %d HP!\n", heroNameHeal, heal);
                        hitPower.put(heroNameHeal, totalHeal);
                    }
                    break;
            }


            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> item : hitPower.entrySet()) {
            System.out.printf("%s\n  HP: %d\n  MP: %d\n", item.getKey(), item.getValue(), mana.get(item.getKey()));
        }

    }
}
