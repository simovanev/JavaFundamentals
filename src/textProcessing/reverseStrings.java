package textProcessing;

import java.util.Scanner;

public class reverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        while (!word.equals("end")) {
            StringBuilder st = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                char symbol = word.charAt(i);
                st.append(symbol);
            }
            System.out.printf("%s = %s\n",word,st.toString());

            word = scanner.nextLine();
        }
    }
}
