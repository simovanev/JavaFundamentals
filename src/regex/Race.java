package regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        HashMap<String, Integer> contestantsMap = new HashMap<>();
        for (int i = 0; i < input.size(); i++) {
            contestantsMap.putIfAbsent((input.get(i)), 0);
        }
        String regexName = "[A-Za-z]";
        Pattern patternName = Pattern.compile(regexName);
        String regexKm = "\\d";
        Pattern patternKm = Pattern.compile(regexKm);
        String results = scanner.nextLine();
        while (!results.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            Matcher matcherName = patternName.matcher(results);
            while (matcherName.find()) {
                name.append(matcherName.group());
            }
            if (contestantsMap.containsKey(name.toString())) {
                Matcher matcherKm = patternKm.matcher(results);
                int distance = 0;
                while (matcherKm.find()) {
                    distance += Integer.parseInt(matcherKm.group());

                }
                contestantsMap.put(name.toString(), contestantsMap.get(name.toString()) + distance);

            }


            results = scanner.nextLine();
        }


        List<String> topThree =
                contestantsMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(3)
                        .map(Map.Entry::getKey).
                        collect(Collectors.toList());



                System.out.printf("1st place: %s\n", topThree.get(0));

                System.out.printf("2nd place: %s\n", topThree.get(1));

                System.out.printf("3rd place: %s\n", topThree.get(2));




    }
}
