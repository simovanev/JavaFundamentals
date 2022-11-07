package fundamentalsBasikSintax;

import java.util.Scanner;

public class theatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int prise=0;

        if (age>=0 && age<=18){
            switch (day){
                case "Weekday":
                    prise=12;
                    break;
                case "Weekend":
                    prise=15;
                    break;
                case "Holiday":
                    prise=5;
                    break;
            }
            System.out.printf("%d%%",prise);
        } else if (age >18 && age<=64) {
            switch (day){
                case "Weekday":
                    prise=18;
                    break;
                case "Weekend":
                    prise=20;
                    break;
                case "Holiday":
                    prise=12;
                    break;
        }
            System.out.printf("%d%%",prise);
    } else if (age>64 && age<=122) {
            switch (day){
                case "Weekday":
                    prise=12;
                    break;
                case "Weekend":
                    prise=15;
                    break;
                case "Holiday":
                    prise=10;
                    break;
        }
            System.out.printf("%d%%",prise);

        }else System.out.println("Error!");
    }}
