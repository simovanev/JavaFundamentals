package textProcessing;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int digit = Integer.parseInt(scanner.nextLine());
        StringBuilder multiNum = new StringBuilder();
        int remain=0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int currentNum = Integer.parseInt(String.valueOf(number.charAt(i))) * digit+remain;
            remain = currentNum / 10;
            multiNum.append(currentNum % 10);
        }
       if (remain>0){
           multiNum.append(remain);
       }
       if (digit==0){
           System.out.println(0);
       }else {
        System.out.println(multiNum.reverse());

       }

    }
}
