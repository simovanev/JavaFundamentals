package arrays;

import java.util.Scanner;

public class printNumInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[elements];
        for (int i = 0; i < elements; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < elements; i++) {
            System.out.printf("%d ",nums[elements-i-1]);
        }
    }
}
