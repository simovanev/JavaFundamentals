package textProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] user = scanner.nextLine().split(", ");
        for (String item : user) {
            if (item.length() >= 3 && item.length() <= 16) {
                boolean isValid=true;
                for (char symbol : item.toCharArray()) {
                if (!(Character.isLetterOrDigit(symbol) || symbol=='_' || symbol=='-')){
                   isValid=false;
                    break;
                }
                }
                if (isValid){
                    System.out.println(item);
                }
            }

        }
    }
}
