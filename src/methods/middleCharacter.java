package methods;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String mid = middleSymbol(text);
        System.out.println(mid);
    }

    public static String middleSymbol(String text) {
        int length = text.length();
        String middleText = "";

        if (length % 2 == 0) {
            middleText += text.charAt((text.length() / 2) - 1);
            middleText += text.charAt(text.length() / 2);
        } else middleText += text.charAt(text.length() / 2);
        return middleText;
    }
}
