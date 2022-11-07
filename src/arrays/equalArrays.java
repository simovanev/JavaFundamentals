package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        int index=0;
        boolean notEqual=false;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i]==secondArr[i]){
                sum+=firstArr[i];

            }else {
                index=i;
                notEqual=true;
                break;
            }


        }if (notEqual){
            System.out.printf("Arrays are not identical. Found difference at %d index.",index);
        }else System.out.printf("Arrays are identical. Sum: %d",sum);
    }
}
