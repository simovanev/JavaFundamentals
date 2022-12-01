package finalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> carMileage = new LinkedHashMap<>();
        Map<String, Integer> carFuel = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\|");
            String car = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);
            carMileage.put(car, mileage);
            carFuel.put(car, fuel);

        }
        String directions = scanner.nextLine();
        while (!directions.equals("Stop")) {
            String[] directionsArr = directions.split("\\s+:\\s+");
            String command = directionsArr[0];
            switch (command) {
                case "Drive":
                    String car1 = directionsArr[1];
                    int distance1 = Integer.parseInt(directionsArr[2]);
                    int fuel1 = Integer.parseInt(directionsArr[3]);
                    if (carFuel.get(car1) >= fuel1) {
                        carFuel.put(car1, carFuel.get(car1) - fuel1);
                        carMileage.put(car1, carMileage.get(car1) + distance1);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car1, distance1, fuel1);
                        if (carMileage.get(car1) >= 100000) {
                            System.out.printf("Time to sell the %s!\n", car1);
                            carMileage.remove(car1);
                            carFuel.remove(car1);
                        }
                    } else System.out.println("Not enough fuel to make that ride");
                    break;
                case "Refuel":
                    String car2 = directionsArr[1];
                    int fuel2 = Integer.parseInt(directionsArr[2]);
                    int fuelCapacity = 75 - carFuel.get(car2);
                    int fuelToFill = Math.min(fuel2, fuelCapacity);
                    System.out.printf("%s refueled with %d liters\n", car2, fuelToFill);
                    carFuel.put(car2, carFuel.get(car2) + fuelToFill);
                    break;
                case "Revert":
                    String car3 = directionsArr[1];
                    int distance3 = Integer.parseInt(directionsArr[2]);
                    System.out.printf("%s mileage decreased by %d kilometers\n",car3,distance3);
                    carMileage.put(car3,Math.max(10000,carMileage.get(car3)-distance3));

                    break;
            }


            directions = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> item : carMileage.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n"
                    ,item.getKey()
                    ,item.getValue()
                    ,carFuel.get(item.getKey()));
        }

    }
}
