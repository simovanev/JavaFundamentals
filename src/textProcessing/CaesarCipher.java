package textProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        for (char symbol: text.toCharArray()){
            char modifiedSymbol=(char)(symbol+3);
            System.out.print(modifiedSymbol);
        }
    }
}
