package finalExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String code=scanner.nextLine();
        String regex="([#@])(?<firstWord>[A-Za-z]{3,})\\1{2}(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(code);
        List<String> pairs1=new ArrayList<>();
        List<String> pairs2=new ArrayList<>();
        int counter=0;
        while (matcher.find()){
            counter++;
            String firstString= matcher.group("firstWord");
            String secondString= matcher.group("secondWord");
            StringBuilder reversed=new StringBuilder(secondString);
            reversed.reverse();
            if (firstString.equals(reversed.toString())){
                pairs1.add(firstString);
                pairs2.add(secondString);
            }
        }
        if (counter>0){

        System.out.printf("%d word pairs found!\n",counter);
        }else System.out.println("No word pairs found!");

        if (pairs1.isEmpty()){
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
            for (int i = 0; i < pairs1.size(); i++) {
                if (i< pairs1.size()-1){
                System.out.printf("%s <=> %s, ",pairs1.get(i),pairs2.get(i));

                } else if (i== pairs2.size()-1) {
                    System.out.printf("%s <=> %s",pairs1.get(i),pairs2.get(i));
                }
            }


        }
    }
}
