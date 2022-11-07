package methods;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double grade=Double.parseDouble(scanner.nextLine());
        gradeInWords(grade);
    }
    private static void gradeInWords(double num){
        if( num<3){
            System.out.println("Fail");
        } else if (num<3.5) {
            System.out.println("Poor");
        } else if (num<4.5) {
            System.out.println("Good");
        } else if (num<5.5) {
            System.out.println("Very good");
            
        }else System.out.println("Excellent");
    }

}
