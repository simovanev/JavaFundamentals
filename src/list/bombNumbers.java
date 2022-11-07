package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] theBomb = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int bombNum = theBomb[0];
        int bombPower = theBomb[1];

        for (int i = 0; i < numbers.size() - 1; i++) {
            int element = numbers.get(i);
            int indexFrom = 0;
            int indexTo = 0;
            if (element == bombNum) {
                if (bombPower + i <= numbers.size() - 1) {
                    indexTo = bombPower + i;
                } else {
                    indexTo = numbers.size() - 1;
                }

                if (i - bombPower >= 0) {

                    indexFrom = i - bombPower;
                } else {
                    indexFrom = 0;

                }



                numbers.removeAll(numbers.subList(indexFrom, indexTo));
            }
        }
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        System.out.println(sum);

    }
}

