package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> parkingLot = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[0];
            String user = input.split("\\s+")[1];
            switch (command) {
                case "register":
                    String plate = input.split("\\s+")[2];
                    if (!parkingLot.containsKey(user)){
                        parkingLot.put(user,plate);
                        System.out.printf("%s registered %s successfully\n",user,plate);
                    }else System.out.printf("ERROR: already registered with plate number %s\n",plate);
                    break;
                case "unregister":
                    if (parkingLot.containsKey(user)){
                        parkingLot.remove(user);
                        System.out.printf("%s unregistered successfully\n",user);
                    }else System.out.printf("ERROR: user %s not found\n",user);
                    break;
            }

        }
        for (Map.Entry<String, String> cars : parkingLot.entrySet()) {
            System.out.printf("%s => %s\n",cars.getKey(),cars.getValue());
        }

    }
}
