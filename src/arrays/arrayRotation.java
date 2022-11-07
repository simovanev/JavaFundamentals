package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] initialArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());
        int nInUse=(n% initialArr.length);
        int[] rotatedArr= new int[initialArr.length];
        for (int i = 0; i < initialArr.length; i++) {

            rotatedArr[i]=initialArr[(i+nInUse)%initialArr.length];
        }
        for (int i = 0; i < rotatedArr.length; i++) {
            System.out.print(rotatedArr[i]+" ");
        }
    }
}
