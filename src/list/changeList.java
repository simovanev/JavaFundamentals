package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> theList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("Delete")) {
                int elementToDelete = Integer.parseInt(command.split(" ")[1]);
                theList.removeAll(Arrays.asList(elementToDelete));
            } else if (command.contains("Insert")) {
                int elementToAdd = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                theList.add(index, elementToAdd);

            }
            command = scanner.nextLine();
        }
        for (int numbers : theList) {
            System.out.print(numbers+" ");
        }
    }
}
