package list;

import java.util.Arrays;
import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentTimeLeft = 0;
        double currentTimeRight = 0;

        int[] timeArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < timeArr.length / 2; i++) {
            currentTimeLeft += timeArr[i];
            if (timeArr[i] == 0) {
                currentTimeLeft *= 0.8;
            }
        }
        for (int i = timeArr.length -1; i > timeArr.length/2; i--) {
            currentTimeRight += timeArr[i];
            if (timeArr[i] == 0) {
                currentTimeRight *= 0.8;
            }
        }


        if (currentTimeLeft < currentTimeRight) {
            System.out.printf("The winner is left with total time: %.1f", currentTimeLeft);
        } else System.out.printf("The winner is right with total time: %.1f", currentTimeRight);
    }
}
