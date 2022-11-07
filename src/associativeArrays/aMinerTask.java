package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int counter = 1;
        String item="";
        Map<String, Integer> treasure = new LinkedHashMap<>();
        while (!command.equals("stop")) {
            if (counter % 2 != 0) {
                treasure.putIfAbsent(command, 0);
                item=command;
            }else{
                int quantity=Integer.parseInt(command);
                treasure.put(item,treasure.get(item)+quantity);
            }

            counter++;
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> element : treasure.entrySet()) {
            System.out.println(element.getKey()+" -> "+element.getValue());
        }

    }
}
