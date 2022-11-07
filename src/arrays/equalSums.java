package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class equalSums {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] numberArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean no=true;
        for (int i = 0; i < numberArr.length ; i++) {
            int sumLeft=0;
            int sumRight=0;
            for (int j = 0; j < i; j++) {
                sumLeft+=numberArr[j];
            }
            for (int j = i+1; j < numberArr.length ; j++) {
                sumRight+=numberArr[j];
            }if (sumLeft==sumRight){
                no=false;
                System.out.println(i);
            }

        }if (no){
            System.out.println("no");
        }
    }
}
