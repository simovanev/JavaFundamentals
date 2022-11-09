package associativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class companyUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> companiesMap = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String name = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];
            companiesMap.putIfAbsent(name,new ArrayList<>());
            if (!companiesMap.get(name).contains(id)){
                companiesMap.get(name).add(id);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> item : companiesMap.entrySet()) {
            System.out.println(item.getKey());
            for (String value: item.getValue()){
                System.out.println("-- "+value);
            }
        }

    }
}
