package objectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class randomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        Random rnd = new Random(words.length);
        for (int i = 0; i < words.length; i++) {
            int index = rnd.nextInt(words.length);
            String oldWord = words[i];
            words[i] = words[index];
            words[index] = oldWord;
        }
        for (String item: words){
            System.out.println(item);
        }
    }
}
