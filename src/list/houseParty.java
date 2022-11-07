package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guests = new ArrayList<>();
        int commands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commands; i++) {
            boolean isOnTheParty = false;
            String person = scanner.nextLine();
            String personName = person.split("\\s+")[0];

            if (person.contains("not")) {
                if (guests.contains(personName)) {

                        guests.remove(personName);
                    } else {
                        System.out.printf("%s is not in the list!\n", personName);
                    }

            } else {
                if (guests.contains(personName)) {

                        System.out.printf("%s is already in the list!\n", personName);

                    } else {
                        guests.add(personName);
                    }
                }
            }


            for (String guest : guests) {
                System.out.println(guest);
            }
        }
    }


