package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> statistic = new LinkedHashMap<>();
        Map<String, Integer> participants = new TreeMap<>();
        String input = scanner.nextLine();
        while (!input.equals("no more time")) {
            //"{username} -> {contest} -> {points}
            String[] inputArr = input.split(" -> ");
            String contest = inputArr[1];
            String user = inputArr[0];
            int points = Integer.parseInt(inputArr[2]);
            statistic.putIfAbsent(contest, new TreeMap<>());
            statistic.get(contest).putIfAbsent(user, points);
            if (statistic.containsKey(contest) && statistic.get(contest).containsKey(user)) {
                if (points > statistic.get(contest).get(user)) {
                    statistic.get(contest).put(user, points);
                }
            }
            participants.putIfAbsent(user, 0);
            participants.put(user, participants.get(user) + points);


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> element : statistic.entrySet()) {
            System.out.printf("%s: %d participants\n",element.getKey(),element.getValue().size());
            for (Map.Entry<String, Integer> elementMap : element.getValue().entrySet()) {
                int count=1;
                System.out.printf("%d. %s <::> %d\n",count,elementMap.getKey(),elementMap.getValue());
                count++;
            }

        }
        System.out.println("Individual standings:");
        for (Map.Entry<String, Integer> students : participants.entrySet()) {
            int count=1;
            System.out.printf("%d. %s -> %d\n",count,students.getKey(),students.getValue());
            count++;
        }


    }
}
