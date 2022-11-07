package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] startArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condense = new int[startArr.length - 1];
        for (int i = 0; i < startArr.length; i++) {
            if (startArr.length==1){
                break;
            }
            if (i < startArr.length - 1) {
                condense[i] = startArr[i] + startArr[i + 1];

            }else {
                int [] newCondensed=new int [condense.length-1];
                startArr=condense;
                condense=newCondensed;
                i=-1;
            }

        }
        System.out.println(startArr[0]);
    }
}
