package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequenceArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxSequence = 0;
        int index = 0;
        int bestIndex = 0;
        int currentMAx = 1;
        for (int i = 1; i < sequenceArr.length; i++) {

            if (sequenceArr[i] == sequenceArr[i - 1]) {
                currentMAx++;

            } else {
                index = i;
                currentMAx = 1;
            }
            if (currentMAx > maxSequence) {
                maxSequence = currentMAx;
                bestIndex = index;

            }
        }
        for (int i = bestIndex; i <bestIndex+ maxSequence; i++) {
            System.out.print(sequenceArr[i] + " ");
        }
    }

}


