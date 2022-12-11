package list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        List<Integer> numbers = new ArrayList<>();
        List<String> symbol = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {

            if (Character.isDigit(input[i])) {
                numbers.add(Integer.parseInt(String.valueOf(input[i])));
            } else symbol.add(String.valueOf(input[i]));

        }
        for (int i = 0; i < numbers.size(); i++) {
            int index = numbers.get(i);
            for (int j = 0; j <= index-1; j++) {
                if (i % 2 == 0) {
                    result.add(symbol.get(j));
                }
                symbol.remove(symbol.get(0));
                j-=1;
                index-=1;
                if (symbol.size()==0 && index>0){
                    break;
                }

            }


        }
        for (String element:result){
        System.out.print(element);

        }
    }
}
