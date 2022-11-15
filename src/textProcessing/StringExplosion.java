package textProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder text=new StringBuilder(scanner.nextLine());
        int force=0;
        for (int i = 0; i < text.length(); i++) {
            char symbol= text.charAt(i);
            if (symbol=='>'){
                force+=Integer.parseInt(String.valueOf(text.charAt(i+1)));
            } else if (symbol!='>' && force>0) {
                text.deleteCharAt(i);
                force--;
                i--;

            }
        }
        System.out.println(text);
    }
}
