package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "^(\\$|\\%)(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<digit1>\\d+)\\]\\|\\[(?<digit2>\\d+)\\]\\|\\[(?<digit3>\\d+)\\]\\|$";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            StringBuilder code=new StringBuilder();
            Matcher matcher = pattern.matcher(input);
            if (!matcher.find()){
                System.out.println("Valid message not found!");
            }else {
                char first=(char)(Integer.parseInt(matcher.group("digit1")));
                char second=(char)(Integer.parseInt(matcher.group("digit2")));
                char third=(char)(Integer.parseInt(matcher.group("digit3")));
                String tagName= matcher.group("tag");
                code.append(first);
                code.append(second);
                code.append(third);
                System.out.printf("%s: %s\n",tagName,code);



            }
        }

    }
}
