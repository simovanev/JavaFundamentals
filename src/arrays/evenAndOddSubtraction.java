package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class evenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int even=0;
        int odd=0;
        for (int element : numbers){
            if (element%2==0){
                even+=element;
            }else odd+=element;

        } System.out.println(even-odd);
    }
}
