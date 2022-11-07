package associativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class associativeArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] numbersArr= Arrays.stream(scanner.nextLine().split(" ")).
                mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double,Integer> count=new TreeMap<>();
        for (double item: numbersArr){
            count.putIfAbsent(item,0);
            count.put(item, count.get(item)+1);


        }
        for (Map.Entry<Double, Integer> entryMap : count.entrySet()) {
            System.out.printf("%.0f -> %d\n",entryMap.getKey(),entryMap.getValue());
        }
    }
}
