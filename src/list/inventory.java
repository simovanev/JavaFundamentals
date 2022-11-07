package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> theList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            if (command.contains("Collect")) {
                String itemToAdd = command.split(" - ")[1];
                if (!theList.contains(itemToAdd)) {
                    theList.add(itemToAdd);
                }
            } else if (command.contains("Drop")) {
                String itemToDrop = command.split(" - ")[1];
                if (theList.contains(itemToDrop)) {
                    theList.remove(itemToDrop);
                }

            } else if (command.contains("Combine")) {
                String itemsToChange = command.split(" - ")[1];
                String oldItem = itemsToChange.split(":")[0];
                String nweItem = itemsToChange.split(":")[1];
                for (int i = 0; i < theList.size(); i++) {
                    if (theList.get(i).equals(oldItem)) {
                        theList.add(i + 1, nweItem);
                        break;
                    }
                }
            } else if (command.contains("Renew")) {
                String itemToRenew = command.split(" - ")[1];
                if (theList.contains(itemToRenew)) {
                    theList.remove(itemToRenew);
                    theList.add(itemToRenew);
                }
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < theList.size() - 1; i++){
            System.out.print(theList.get(i)+", ");
        }
        System.out.println(theList.get(theList.size()-1));
    }
}
