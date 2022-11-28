package finalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        List<String> travelList=new ArrayList<>();
        int counter=0;
        String regex="([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        while (matcher.find()){
            travelList.add(matcher.group("destination"));
            counter+=matcher.group("destination").length();
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ",travelList));
        System.out.printf("Travel Points: %d",counter);
    }
}
