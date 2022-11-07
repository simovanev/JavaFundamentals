package arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = Integer.parseInt(scanner.nextLine());

        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]+" ");
        }
    }
}
