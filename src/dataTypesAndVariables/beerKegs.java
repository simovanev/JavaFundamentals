package dataTypesAndVariables;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfKegs=Integer.parseInt(scanner.nextLine());
        double biggestVolume=Double.MIN_VALUE;
        String biggestKeg="";

        for (int i = 0; i < numberOfKegs; i++) {
            String model= scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height= Integer.parseInt(scanner.nextLine());
            double volume= Math.PI*Math.pow(radius,2)*height;
            if (volume>biggestVolume){
                biggestVolume=volume;
                biggestKeg=model;
            }

        }
        System.out.println(biggestKeg);
    }
}
