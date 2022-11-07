package methods;

import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            int numToCheck = byEight(i);
            if (hasOdd(numToCheck)){
                System.out.println(numToCheck);
            }
        }


    }

    public static int byEight(int num) {
        int special = 0;
        int number = num;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        if (sum % 8 == 0) {
            special = num;
        }


        return special;
    }

    public static boolean hasOdd(int num) {
        while (num > 0) {
            int numToCheck = num % 10;


            if (numToCheck % 2 != 0) {
                return true;
            } else num = num / 10;

        }
        return false;
    }
}
