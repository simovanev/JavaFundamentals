package midExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class midExam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffeeList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        int numberOfManipulations = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfManipulations; i++) {
            String whatToDo = scanner.nextLine();

            if (whatToDo.contains("Include")) {
                coffeeList.add(whatToDo.split("\\s+")[1]);

            } else if (whatToDo.contains("Remove")) {
                String order = whatToDo.split("\\s+")[1];
                int numberToRemove = Integer.parseInt(whatToDo.split("\\s+")[2]);
                if (coffeeList.size() >= numberToRemove) {


                    if (order.equals("first")) {
                        for (int j = 1; j <= numberToRemove; j++) {
                            coffeeList.remove(0);
                        }

                    } else if (order.equals("last")) {
                        for (int j = 1; j <= numberToRemove; j++) {
                            coffeeList.remove(coffeeList.size() - 1);
                        }
                    }
                }

            } else if (whatToDo.contains("Prefer")) {
                int firstIndex = Integer.parseInt(whatToDo.split("\\s+")[1]);
                int secondIndex = Integer.parseInt(whatToDo.split("\\s+")[2]);
                if (firstIndex < coffeeList.size() && secondIndex < coffeeList.size()) {
                    String firstCoffee = coffeeList.get(firstIndex);
                    coffeeList.set(firstIndex,coffeeList.get(secondIndex));
                    coffeeList.set(secondIndex,firstCoffee);
                }

            } else if (whatToDo.contains("Reverse")) {
                Collections.reverse(coffeeList);
            }

        }
        System.out.println("Coffees:");
        for (String item:coffeeList){
            System.out.print(item+" ");
        }
    }
}
