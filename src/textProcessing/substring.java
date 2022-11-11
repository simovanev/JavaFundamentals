package textProcessing;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toRemove = scanner.nextLine();
        String word = scanner.nextLine();
        while (word.indexOf(toRemove) != -1) {

            word = word.replace(toRemove, "");
        }


        System.out.println(word);
    }
}
