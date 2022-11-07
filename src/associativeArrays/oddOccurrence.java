package associativeArrays;

import java.util.*;

public class oddOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordArr = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> evenWordMap = new LinkedHashMap<>();
        for (int i = 0; i < wordArr.length; i++) {
            String word=wordArr[i].toLowerCase();
            if (!evenWordMap.containsKey(word)) {
               evenWordMap.put(word,0);
            }
            evenWordMap.put(word,evenWordMap.get(word)+1);
        }
        ArrayList<String> theList= new ArrayList<>();
        for (Map.Entry<String, Integer> itemMap : evenWordMap.entrySet()) {
            if (itemMap.getValue() % 2!=0){
                theList.add(itemMap.getKey());
            }
        }
        System.out.println(String.join(", ",theList));

    }
}
