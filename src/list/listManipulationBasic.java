package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> theList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] whatToDo = command.split(" ");
            String action = whatToDo[0];
            switch (action) {
                case "Add":
                    theList.add(Integer.valueOf(whatToDo[1]));
                    break;
                case "Remove":
                    theList.remove(Integer.valueOf(whatToDo[1]));
                    break;
                case "RemoveAt":
                    theList.remove(Integer.parseInt(whatToDo[1]));
                    break;
                case "Insert":
                    theList.add(Integer.parseInt(whatToDo[2]), Integer.parseInt(whatToDo[1]));
                    break;

            }
                    command= scanner.nextLine();
        }
        for (int element : theList) {
            System.out.print(element + " ");
        }
    }
}
