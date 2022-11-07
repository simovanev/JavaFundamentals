package methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double number=Double.parseDouble(scanner.nextLine());
        int power=Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.######").format( maxPower(number,power)));
    }
    public  static double maxPower(double a,int b ){
        double result=1;
        for (int i = 0; i < b; i++) {
            result=result*a;
        }return result;

    }
}
