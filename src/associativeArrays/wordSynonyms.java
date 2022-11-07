package associativeArrays;

import java.util.*;

public class wordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> synonymMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            synonymMap.putIfAbsent(word, new ArrayList<>());
            synonymMap.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> item : synonymMap.entrySet()) {
            System.out.printf("%s - %s\n",item.getKey(),String.join(", ", item.getValue()));
        }

    }
}
