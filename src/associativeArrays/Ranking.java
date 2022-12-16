package associativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contestMap = new HashMap<>();
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

            }

            participants = scanner.nextLine();
        }
    }

}
