package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int [] firstArr= new int[n];
        int [] secondArr= new int[n];
        for (int i = 0; i < n; i++) {
            int[] currentArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i%2==0){
                firstArr[i]=currentArr[0];
                secondArr[i]=currentArr[1];
            }else {
                firstArr[i]=currentArr[1];
                secondArr[i]=currentArr[0];
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.print(firstArr[k] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(secondArr[i]+" ");

        }

        }
    }
