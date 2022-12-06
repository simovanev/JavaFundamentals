package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        StringBuilder message= new StringBuilder(scanner.nextLine());
        StringBuilder code=new StringBuilder();
        for (int i = 0; i < numberList.size(); i++) {
            int element= numberList.get(i);
            int letter=0;
            while (element>0){
                letter+=element%10;
                element/=10;
            }
            code.append(message.charAt(letter%message.length()));
            message.deleteCharAt(letter%message.length());


        }
        System.out.println(code);
    }
}
