package associativeArrays;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contestMap = new HashMap<>();
        Map<String, HashMap<String, Integer>> results = new HashMap<>();
        int maxScore = 0;
        String bestStudent = "";
        String input = scanner.nextLine();

        while (!input.equals("end of contests")) {
            String contest = input.split(":")[0];
            String password = input.split(":")[1];
            contestMap.put(contest, password);

            input = scanner.nextLine();
        }

        String participants = scanner.nextLine();
        while (!participants.equals("end of submissions")) {
            String currentContest = participants.split("=>")[0];
            String currentPass = participants.split("=>")[1];
            String user = participants.split("=>")[2];
            int points = Integer.parseInt(participants.split("=>")[3]);

            if (contestMap.containsKey(currentContest) && contestMap.get(currentContest).equals(currentPass)) {
                results.putIfAbsent(user, new HashMap<>());

                results.get(user).putIfAbsent(currentContest, points);
                if (results.containsKey(user) && results.get(user).containsKey(currentContest))
                    if (results.get(user).get(currentContest) < points) {
                        results.get(user).put(currentContest, points);
                    }
            }

            participants = scanner.nextLine();
        }
        for (Map.Entry<String, HashMap<String, Integer>> item : results.entrySet()) {
            int score=0;
            for (Map.Entry<String, Integer> element : item.getValue().entrySet()) {
              score+= element.getValue();

            }
            if (score>maxScore){
                maxScore=score;
                bestStudent=item.getKey();
            }

        }
        System.out.printf("Best candidate is %s with total %d points.\n",bestStudent,maxScore);
        for (Map.Entry<String, HashMap<String, Integer>> entry : results.entrySet()) {
            System.out.println(entry.getKey());
            for (Map.Entry<String, Integer> entryMap : entry.getValue().entrySet()) {
                System.out.printf("# %s -> %d\n",entryMap.getKey(),entryMap.getValue());
            }

        }


    }

}
