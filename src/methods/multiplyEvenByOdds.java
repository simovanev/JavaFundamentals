package methods;

import java.util.Scanner;

public class multiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getOddByEven(number));

    }

    private static int getEvenSum(int a) {
        int evenSum = 0;
        int n=Math.abs(a);
        while (n > 0) {
            int nextDigit = n % 10;
            if (nextDigit % 2 == 0) {
                evenSum += nextDigit;
            }
            n = n / 10;
        }
        return evenSum;
    }

    private static int getOddSum(int a) {
        int oddSum = 0;
        int n=Math.abs(a);
        while (n > 0) {
            int nextDigit = n % 10;
            if (nextDigit % 2 != 0) {
                oddSum += nextDigit;
            }
            n = n / 10;

        }
        return oddSum;
    }
    private  static int getOddByEven(int n){

        return  getEvenSum(n)*getOddSum(n);
    }
    }
