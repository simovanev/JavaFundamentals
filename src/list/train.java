package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String event = scanner.nextLine();
        while (!event.equals("end")) {
            if (event.contains("Add")) {
                int addWagon = Integer.parseInt(event.split(" ")[1]);
                train.add(addWagon);
            } else {
                int addPassengers = Integer.parseInt(event);
                for (int i = 0; i < train.size(); i++) {
                    int newWagon = 0;
                    if (train.get(i) + addPassengers <= maxCapacity) {
                        newWagon = train.get(i) + addPassengers;
                        train.set(i, newWagon);
                        break;
                    }
                }
            }


            event = scanner.nextLine();
        }
        for (int element : train) {
            System.out.print(element+" ");
        }
    }
}
