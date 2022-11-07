package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumEven=0;
        for (int num:numbers){
            if (num%2==0){
                sumEven+=num;
            }


        }
        System.out.println(sumEven);
    }
}
