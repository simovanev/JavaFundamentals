package finalExamPreparation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([*:]{2})(?<word>[A-Z][a-z]{2,})\\1";
        Pattern digit = Pattern.compile("\\d");
        long coolNumber = 1;
        int counter = 0;
        List<String> coolList = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        Matcher cool = digit.matcher(text);
        while (cool.find()) {
            coolNumber *= Integer.parseInt(cool.group());
        }
        while (matcher.find()) {
                counter++;
            String word = matcher.group("word");
            int sumText = 0;
            for (int i = 0; i < word.length(); i++) {
                sumText += word.charAt(i);

            }
            if (sumText > coolNumber) {
                coolList.add(matcher.group());
            }

        }
        System.out.printf("Cool threshold: %d\n",coolNumber);
        System.out.printf("%d emojis found in the text. The cool ones are:\n",counter);

        for (String item: coolList){
            System.out.println(item);
        }

    }
}
