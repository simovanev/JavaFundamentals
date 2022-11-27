package finalExamPreparation;

import java.text.Format;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String food= scanner.nextLine();
        String regex = "([|#])[A-Za-z ]+\\1\\d{2}/\\d{2}/\\d{2}\\1\\d+\\1";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(food);
        int totalCalories=0;
        StringBuilder output=new StringBuilder();
        while (matcher.find()){
            String foodName= matcher.group().split("[|#]")[1];
            String expirationDate= matcher.group().split("[|#]")[2];
            int calories= Integer.parseInt(matcher.group().split("[|#]")[3]);
            totalCalories+=calories;
            output.append(String.format("Item: %s, Best before: %s, Nutrition: %d\n",foodName,expirationDate,calories));
        }
        System.out.printf("You have food to last you for: %d days!\n",totalCalories/2000);
        System.out.println(output);

    }
}
