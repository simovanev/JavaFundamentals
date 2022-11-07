package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
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
                case "Contains":
                    boolean yes = false;
                    for (int element : theList) {
                        if (element == Integer.parseInt(whatToDo[1])) {
                            yes = true;
                            break;
                        }
                    }
                    if (yes) {
                        System.out.println("Yes");
                    } else System.out.println("No such number");

                    break;

                case "Print":
                    if (whatToDo[1].equals("even")) {
                        for (int element : theList) {
                            if (element % 2 == 0) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();

                    } else if (whatToDo[1].equals("odd")) {
                        for (int element : theList) {
                            if (element % 2 != 0) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case "Get":
                    int sum = 0;
                    for (int i = 0; i < theList.size(); i++) {
                        sum += theList.get(i);

                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    for (int element : theList) {


                        switch (whatToDo[1]) {
                            case "<":
                                if (element < Integer.parseInt(whatToDo[2])) {
                                    System.out.print(element + " ");
                                }
                                break;
                            case ">":
                                if (element > Integer.parseInt(whatToDo[2])) {
                                    System.out.print(element + " ");
                                }
                                break;
                            case "<=":
                                if (element <= Integer.parseInt(whatToDo[2])) {
                                    System.out.print(element + " ");
                                }
                                break;
                            case ">=":
                                if (element >= Integer.parseInt(whatToDo[2])) {
                                    System.out.print(element + " ");
                                }
                                break;
                        }
                    }
                    System.out.println();
                    break;

            }
            command = scanner.nextLine();
        }
    }
}
