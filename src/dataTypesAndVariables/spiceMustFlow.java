package dataTypesAndVariables;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int yieldBegining=Integer.parseInt(scanner.nextLine());
        int yield=yieldBegining;
        int saved=0;
        int dayCounter=0;

        while (yield>=100){
            dayCounter++;
            saved+=yield-26;
            yield-=10;

        }
        System.out.println(dayCounter);
        if (yieldBegining<100 && yieldBegining>26){
            System.out.println(yield-26);
        }else if (yieldBegining<=26){
            System.out.println(0);
        } else if (yieldBegining>=100) {

        System.out.println(saved-26);
        }
    }
}
