package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> firstList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int size=Math.min(firstList.size(),secondList.size());
        List<Integer> mergedList=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            mergedList.add(firstList.get(i));
            mergedList.add(secondList.get(i));

        }if (firstList.size()>secondList.size()){
            mergedList.addAll(firstList.subList(size, firstList.size()));
        }else mergedList.addAll(secondList.subList(size,secondList.size()));
        for (int item:mergedList){
            System.out.print(item+" ");
        }
    }
}
