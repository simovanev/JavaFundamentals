package methods;

import java.util.Locale;
import java.util.Scanner;

public class vowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String textOfLowers = text.toLowerCase();
        int numberOfVowels = vowelCounter(textOfLowers);
        System.out.println(numberOfVowels);
    }

    public static int vowelCounter(String text) {
        int counter=0;
        for (char item : text.toCharArray()) {
            if (item == 'a' || item == 'e' || item == 'i' || item == 'o' || item == 'u'){
                counter++;
            }
        }return counter;
    }
}
