package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Complete")) {
            if (input.contains("Make Upper")) {
                StringBuilder currentWord = new StringBuilder();
                int index = Integer.parseInt(input.split("\\s+")[2]);
                for (int i = 0; i < password.length(); i++) {
                    char symbol = password.charAt(i);
                    if (i == index) {
                        symbol = Character.toUpperCase(symbol);

                    }
                    currentWord.append(symbol);
                }
                    password = currentWord.toString();
                    System.out.println(password);


            } else if (input.contains("Make Lower")) {
                StringBuilder currentWord = new StringBuilder();
                int index = Integer.parseInt(input.split("\\s+")[2]);
                for (int i = 0; i < password.length(); i++) {
                    char symbol = password.charAt(i);
                    if (i == index) {
                        symbol = Character.toLowerCase(symbol);

                    }
                    currentWord.append(symbol);
                }
                    password = currentWord.toString();
                    System.out.println(password);

            } else if (input.contains("Insert")) {
                int indexToInsert=Integer.parseInt(input.split("\\s+")[1]);
                if (indexToInsert>=0 && indexToInsert<password.length()){
                    String charToInsert= input.split("\\s+")[2];
                    StringBuilder passwordNew=new StringBuilder(password);
                    passwordNew.insert(indexToInsert,charToInsert);
                    password=passwordNew.toString();
                    System.out.println(password);
                }

            } else if (input.contains("Replace")) {
                char symbolToChange= input.split("\\s+")[1].toCharArray()[0];
                int value=Integer.parseInt(input.split("\\s+")[2]);
                char newSymbol= (char) (symbolToChange+value);
                StringBuilder replaceWord=new StringBuilder();
                boolean toPrint=false;
                for (int i = 0; i < password.length(); i++) {
                    char letter=password.charAt(i);
                    if (letter==symbolToChange){
                        toPrint=true;
                        letter=newSymbol;
                    }
                    replaceWord.append(letter);


                }


                password=replaceWord.toString();
                if (toPrint){
                System.out.println(password);

                }



            } else if (input.contains("Validation")) {
                if (password.length() < 8) {
                    System.out.println("Password must be at least 8 characters long!");
                }
                Pattern letterDigitsUnderscore = Pattern.compile("[^\\w\\d_]");
                Matcher correct = letterDigitsUnderscore.matcher(password);
                if (correct.find()) {
                    System.out.println("Password must consist only of letters, digits and _!");
                }
                Pattern uppercase = Pattern.compile("[A-Z]");
                Matcher upper = uppercase.matcher(password);
                if (!upper.find()) {
                    System.out.println("Password must consist at least one uppercase letter!");
                }
                Pattern lowercase = Pattern.compile("[a-z]");
                Matcher lower = lowercase.matcher(password);
                if (!lower.find()) {
                    System.out.println("Password must consist at least one lowercase letter!");
                }
                Pattern atLeastdDgit = Pattern.compile("\\d");
                Matcher digit = atLeastdDgit.matcher(password);
                if (!digit.find()) {
                    System.out.println("Password must consist at least one digit!");

                }
            }


            input = scanner.nextLine();
        }

    }
}
