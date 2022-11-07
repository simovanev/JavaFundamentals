package dataTypesAndVariables;

import java.util.Scanner;

public class refractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
        int sum = 0;
        boolean specialNum = false;
        int currentNum = i;

            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            specialNum = sum == 5 || sum == 7 || sum == 11;
            if (specialNum){
            System.out.printf("%d -> True%n", i);

            }else System.out.printf("%d -> False%n", i);

        }

    }
}
