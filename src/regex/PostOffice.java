package regex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("|");
        String firstPart = input[0];
        String secondPart = input[1];
        String thirdPart = input[2];
        Pattern startLetter = Pattern.compile("([#\\$%\\*&])(?<start>[A-Z]+)\\1");
        Matcher matcher = startLetter.matcher(firstPart);
        Map<Character,Integer> startLetterList = new HashMap<>();
        StringBuilder startLetterAll=new StringBuilder();
        while (matcher.find()) {
            startLetterAll.append((matcher.group("start")));
        }
        for (int i = 0; i < startLetterAll.length(); i++) {
            char currentChar=startLetterAll.charAt(i);
            startLetterList.put(currentChar,0);
        }
        Pattern wordLength = Pattern.compile("(?<letter>\\d{2}):(?<Length>\\d{2})");
        Matcher wordLengthMatch = wordLength.matcher(secondPart);
        while (wordLengthMatch.find()) {
            char currentNumToChar = (char) Integer.parseInt(wordLengthMatch.group("letter"));
            int length=Integer.parseInt(wordLengthMatch.group("Length"));
            if (startLetterList.containsKey(currentNumToChar)){
                startLetterList.put(currentNumToChar,length);
            }
        }

    }
}
