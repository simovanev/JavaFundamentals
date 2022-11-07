package associativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> coursesMap = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];
            coursesMap.putIfAbsent(course, new ArrayList<>());
            coursesMap.get(course).add(student);


            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> item : coursesMap.entrySet()) {
            System.out.printf("%s: %d\n", item.getKey(), item.getValue().size());
            for (int i = 0; i < item.getValue().size(); i++) {
                System.out.println(" -- "+ item.getValue().get(i));
            }
            }
        }

    }

