package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        boolean firstPlayerWin = false;
        for (int i = 0; i < firstPlayer.size(); i++) {
            int firstCard = firstPlayer.get(i);
            int secondCard = secondPlayer.get(i);
            if (firstCard > secondCard) {
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
                firstPlayer.remove(firstPlayer.get(i));
                secondPlayer.remove(secondPlayer.get(i));

            } else if (secondCard > firstCard) {
                secondPlayer.add(secondCard);
                secondPlayer.add(firstCard);
                firstPlayer.remove(firstPlayer.get(i));
                secondPlayer.remove(secondPlayer.get(i));

            } else {
                firstPlayer.remove(firstPlayer.get(i));
                secondPlayer.remove(secondPlayer.get(i));

            }
            if (firstPlayer.size() == 0) {
                break;

            } else if (secondPlayer.size() == 0) {
                firstPlayerWin = true;
                break;
            }
            i = -1;
        }
        int sum = 0;
        if (firstPlayerWin) {
            for (int item : firstPlayer) {
                sum += item;
            }
                System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int item : secondPlayer) {
                sum += item;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }
    }
}
