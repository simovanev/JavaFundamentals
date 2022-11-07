package arrays;

import java.util.Scanner;

public class treasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] initialLoot = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            if (command.contains("Loot")) {
                String[] lootArr = command.split(" ");

                for (int i = 1; i < lootArr.length; i++) {
                    boolean contained = false;
                    for (int j = 0; j < initialLoot.length; j++) {
                        if (lootArr[i].equals(initialLoot[j])) {
                            contained = true;
                            break;
                        }
                    }
                    if (!contained) {
                        String newLoot = lootArr[i] + " " + String.join(" ", initialLoot);
                        initialLoot = newLoot.split(" ");

                    }
                }


            } else if (command.contains("Drop")) {
                String[] lootArr = command.split(" ");
                int index = Integer.parseInt(lootArr[1]);
                if (index <= initialLoot.length) {
                    String temporaryLast = initialLoot[index - 1];
                    for (int i = index - 1; i < initialLoot.length - 1; i++) {
                        initialLoot[i] = initialLoot[i + 1];

                    }
                        initialLoot[initialLoot.length - 1] = temporaryLast;
                }

            } else if (command.contains("Steal")) {
                String[] lootArr = command.split(" ");
                int index = Integer.parseInt(lootArr[1]);
                if (index<=initialLoot.length){
                    String [] newLoot=new String[initialLoot.length-index];
                    for (int i = 0; i < initialLoot.length-index; i++) {

                     newLoot[i]=initialLoot[i];

                    }
                    for (int i = initialLoot.length-index; i <initialLoot.length-1 ; i++) {
                        System.out.print(initialLoot[i]+", ");
                    }
                    System.out.println(initialLoot[initialLoot.length-1]);
                    initialLoot=newLoot;


                }
            }

            command = scanner.nextLine();
        }int lengthCounter=0;

        for (int i = 0; i < initialLoot.length; i++) {
            lengthCounter+=initialLoot[i].length();

        }
        if (lengthCounter>0){
            System.out.printf("Average treasure gain: %.2f pirate credits.",1.0*lengthCounter/ initialLoot.length);
        }else System.out.println("Failed treasure hunt.");
    }
}
