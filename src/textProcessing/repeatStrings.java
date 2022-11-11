package textProcessing;

import java.util.Scanner;

public class repeatStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] words=scanner.nextLine().split(" ");
        StringBuilder str= new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String currentWord=words[i];
            for (int j = 0; j < currentWord.length(); j++) {
                str.append(currentWord);
            }
        }
        System.out.println(str);
    }
}
