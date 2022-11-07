package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countsCahInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().replace(" ", "");
        Map<Character, Integer> collection = new LinkedHashMap<>();
        for (char symbol : word.toCharArray()) {
            collection.putIfAbsent(symbol, 0);
            collection.put(symbol,collection.get(symbol)+1);
        }
        for (Map.Entry<Character, Integer> item : collection.entrySet()) {
            System.out.println(item.getKey()+" -> "+item.getValue());
        }

    }
}
