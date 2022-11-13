package textProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String first = input.split(" ")[0];
        String second = input.split(" ")[1];
        int sumTotal = 0;
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            int currentSum = first.charAt(i) * second.charAt(i);
            sumTotal += currentSum;
        }
        if (first.length() > second.length()) {
            for (int i = second.length(); i < first.length(); i++) {
                sumTotal += first.charAt(i);
            }
        } else if (first.length() < second.length()) {
            for (int i =  first.length(); i < second.length(); i++) {
                sumTotal += second.charAt(i);
            }
        }
        System.out.println(sumTotal);
    }
}
