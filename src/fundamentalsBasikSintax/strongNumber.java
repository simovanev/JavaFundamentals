package fundamentalsBasikSintax;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int digit = number;
        int factorialTotal=0;
        while (digit != 0) {
            int n = digit % 10;
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            factorialTotal+=factorial;
                digit /= 10;
        }if (number==factorialTotal){
            System.out.println("yes");
        }else System.out.println("no");
    }
}
