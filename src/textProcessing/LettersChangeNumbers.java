package textProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[ ]input= scanner.nextLine().split("\\s+");
        double totalSum=0;
        for (int i = 0; i < input.length; i++) {
            char firstLetter= input[i].charAt(0);
            char lastLetter=input[i].charAt(input[i].length()-1);
            double number= Double.parseDouble(input[i].substring(1,input[i].length()-1));

            if (Character.isUpperCase(firstLetter)){
                number/=(firstLetter-64);
            }else number*=(firstLetter-96);
            if (Character.isUpperCase(lastLetter)){
                number-=(lastLetter-64);
            }else number+=(lastLetter-96);

            totalSum+=number;

        }
        System.out.printf("%.2f",totalSum);
    }
}
