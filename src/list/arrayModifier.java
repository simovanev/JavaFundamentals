package list;

import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] theArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        //swap {index1} {index2}" takes two elements and swap their places.
        //•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
        //•	"decrease" decreases all elements in the array with 1.
        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                int storeInt = theArr[firstIndex];
                theArr[firstIndex] = theArr[secondIndex];
                theArr[secondIndex] = storeInt;

            } else if (command.contains("multiply")) {
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                theArr[firstIndex] = theArr[firstIndex] * theArr[secondIndex];

            } else if (command.contains("decrease")) {
                for (int i = 0; i < theArr.length; i++) {
                    theArr[i]--;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < theArr.length - 1; i++) {
            System.out.print(theArr[i] + ", ");

        }
        System.out.print(theArr[theArr.length - 1]);
    }
}

