package finalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regex="@#+[A-Z][A-Za-z\\d]{4,}[A-Z]@#+";
        Pattern pattern=Pattern.compile(regex);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            StringBuilder code=new StringBuilder();
            String barKode= scanner.nextLine();
            Matcher matcher= pattern.matcher(barKode);
            if (matcher.find()){
                for (char symbol:barKode.toCharArray()){
                   if( Character.isDigit(symbol)){
                       code.append(symbol);
                   }

                }
                if (code.length()==0){
                    System.out.println("Product group: 00");
                }else System.out.printf("Product group: %s\n",code);
            }else System.out.println("Invalid barcode");
        }
    }
}
