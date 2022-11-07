package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
//•	Add {number} - add number at the end
//•	Insert {number} {index} - insert number at given index
//•	Remove {index} - remove that index
//•	Shift left {count} - first number becomes last 'count' times
//•	Shift right {count} - last number becomes first 'count' times
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbersList.add(numberToAdd);
            } else if (command.contains("Insert")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (index >= 0 && index < numbersList.size()) {
                    numbersList.add(index, numberToAdd);
                } else System.out.println("Invalid index");
            } else if (command.contains("Remove")) {
                int indexToRemove = Integer.parseInt(command.split("\\s+")[1]);
                if (indexToRemove >= 0 && indexToRemove < numbersList.size()) {
                    numbersList.remove(indexToRemove);
                } else System.out.println("Invalid index");
            } else if (command.contains("left")) {
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= count; i++) {
                    int firstNum = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNum);

                }
            } else if (command.contains("right")) {
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= count; i++) {
                    int lastNum = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, lastNum);
                }
            }

            command = scanner.nextLine();
        }
        for (int element : numbersList) {
            System.out.print(element + " ");
        }
    }
}
