package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> studentsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languagesMap = new LinkedHashMap<>();
        while (!input.equals("exam finished")) {
            String name = input.split("-")[0];
            String language = input.split("-")[1];
            if (language.equals("banned")) {
                studentsMap.remove(name);
            } else {
            int points = Integer.parseInt(input.split("-")[2]);
                studentsMap.putIfAbsent(name, 0);
                if (studentsMap.get(name)<points){
                studentsMap.put(name, points);

                }
                languagesMap.putIfAbsent(language, 0);
                languagesMap.put(language, languagesMap.get(language) + 1);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        studentsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        languagesMap.entrySet().forEach(element -> System.out.println(element.getKey() + " - " + element.getValue()));
    }
}
