package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        String regex="[^\\d]";
        Pattern symbol= Pattern.compile(regex);
        Matcher matcher= symbol.matcher(input);
        List<String> symbolList=new ArrayList<>();
        while (matcher.find()){
            String current = matcher.group().toLowerCase();
            if (!symbolList.contains(current)){
                symbolList.add(current);
            }
        }
        System.out.printf("Unique symbols used: %d\n",symbolList.size());
        Pattern groups=Pattern.compile("[^\\d]+");
        Pattern repetitions=Pattern.compile("\\d+");
        Matcher groupsMatch= groups.matcher(input);
        Matcher repetitionsMatch= repetitions.matcher(input);
        while (groupsMatch.find() && repetitionsMatch.find()){
            String toRepeat=groupsMatch.group().toUpperCase();
            int count=Integer.parseInt(repetitionsMatch.group());
            for (int i = 0; i < count; i++) {
                System.out.print(toRepeat);
            }
        }
    }
}
