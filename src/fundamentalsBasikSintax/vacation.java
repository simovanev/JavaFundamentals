package fundamentalsBasikSintax;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int people=Integer.parseInt(scanner.nextLine());
        String type= scanner.nextLine();
        String day= scanner.nextLine();
        double prise=0;
        switch (day){
            case  "Friday":
                switch (type){
                    case "Students":
                        prise=8.45*people;
                        if (people>=30){
                            prise=prise*0.85;
                        }
                        break;
                    case "Business":
                        prise=10.9*people;
                        if (people>=100){
                            prise=10.9*(people-10);
                        }
                        break;
                    case "Regular":
                        prise=15*people;
                        if (people>=10 && people<=20){
                            prise=prise*0.95;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        prise = 9.8 * people;
                        if (people >= 30) {
                            prise = prise * 0.85;
                        }
                        break;
                    case "Business":
                        prise = 15.6 * people;
                        if (people >= 100) {
                            prise = 15.6 * (people - 10);
                        }
                        break;
                    case "Regular":
                        prise = 20 * people;
                        if (people >= 10 && people <= 20) {
                            prise = prise * 0.95;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        prise = 10.46 * people;
                        if (people >= 30) {
                            prise = prise * 0.85;
                        }
                        break;
                    case "Business":
                        prise = 16 * people;
                        if (people >= 100) {
                            prise = 16 * (people - 10);
                        }
                        break;
                    case "Regular":
                        prise = 22.5 * people;
                        if (people >= 10 && people <= 20) {
                            prise = prise * 0.95;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f",prise);
    }
}
