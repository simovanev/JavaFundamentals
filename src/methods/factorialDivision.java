package methods;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        double outcome=factorialDiv(firstNum,secondNum);
        System.out.printf("%.2f",outcome);
    }

    public static double factorialDiv(int a, int b){
        double firstFactorial=1;
        double secondFactorial=1;
        double result=0;
        for (int i = 1; i <=a ; i++) {
            firstFactorial=firstFactorial*i;

        }
        for (int i = 1; i <=b ; i++) {
            secondFactorial=secondFactorial*i;

        }result=firstFactorial/secondFactorial;
        return result;
    }
}
