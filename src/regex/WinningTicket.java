package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        String regex6 = "([@#^$])\\1{5}";
        String regex7 = "([@#^$])\\1{6}";
        String regex8 = "([@#^$])\\1{7}";
        String regex9 = "([@#^$])\\1{8}";
        String regex10 = "([@#^$])\\1{9}";
        Pattern pattern6 = Pattern.compile(regex6);
        Pattern pattern7 = Pattern.compile(regex7);
        Pattern pattern8 = Pattern.compile(regex8);
        Pattern pattern9 = Pattern.compile(regex9);
        Pattern pattern10 = Pattern.compile(regex10);


        for (int i = 0; i < input.length; i++) {
            if (input[i].length() == 20) {


                String first = input[i].substring(0, input[i].length() / 2);
                String second = input[i].substring(input[i].length() / 2);
                Matcher matcher6 = pattern6.matcher(first);
                Matcher matcher7 = pattern7.matcher(first);
                Matcher matcher8 = pattern8.matcher(first);
                Matcher matcher9 = pattern9.matcher(first);
                Matcher matcher10 = pattern10.matcher(first);
                Matcher matcher66 = pattern6.matcher(second);
                Matcher matcher77 = pattern7.matcher(second);
                Matcher matcher88 = pattern8.matcher(second);
                Matcher matcher99 = pattern9.matcher(second);
                Matcher matcher100 = pattern10.matcher(second);
                if (matcher6.find() == matcher66.find()) {
                    System.out.printf("ticket %s - 6%s\n", input[i], matcher6.group(1));
                } else if (matcher7.find() == matcher77.find()) {
                    System.out.printf("ticket %s - 7%s\n", input[i], matcher7.group(1));
                } else if (matcher8.find() == matcher88.find()) {
                    System.out.printf("ticket %s - 8%s\n", input[i], matcher8.group(1));
                } else if (matcher9.find() == matcher99.find()) {
                    System.out.printf("ticket %s - 9%s\n", input[i], matcher9.group(1));
                } else if (matcher10.find() == matcher100.find()) {
                    System.out.printf("ticket %s - 10%s Jackpot!\n", input[i], matcher10.group(1));
                } else System.out.printf("ticket  %s - no match\n", input[i]);

            }else System.out.println("invalid ticket");
        }

    }
}
