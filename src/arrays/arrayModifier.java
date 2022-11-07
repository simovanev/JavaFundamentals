package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.contains("swap")) {
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                int current = array[firstIndex];
                array[firstIndex] = array[secondIndex];
                array[secondIndex] = current;

            } else if (command.contains("multiply")) {
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                int currentMultiply = array[firstIndex] * array[secondIndex];
                array[firstIndex] = currentMultiply;
            } else if (command.contains("decrease")) {
                for (int i=0;i< array.length;i++){
                    array[i]--;

                }
            }
        command= scanner.nextLine();

    }
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+","+" ");

        }
        System.out.println(array[array.length-1]);

}}
