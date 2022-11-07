package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class topInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]){
                System.out.print(array[i]+" ");
            }

        }
            System.out.println(array[array.length-1]);
    }
}
