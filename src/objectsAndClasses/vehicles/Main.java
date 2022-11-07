package objectsAndClasses.vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();
        String item = scanner.nextLine();
        double carPower = 0;
        double truckPower = 0;
        int carCounter = 0;
        int truckCounter = 0;
        while (!item.equals("End")) {
            String type = item.split("\\s+")[0];
            String model = item.split("\\s+")[1];
            String color = item.split("\\s+")[2];
            int power = Integer.parseInt(item.split("\\s+")[3]);
            Vehicle current = new Vehicle(type, model, color, power);
            vehicleList.add(current);
            if (current.getType().equals("car")) {
                carPower += current.getPower();
                carCounter++;
            } else {
                truckPower += current.getPower();
                truckCounter++;
            }
            item = scanner.nextLine();
        }

        String modelToCheck = scanner.nextLine();

        while (!modelToCheck.equals("Close the Catalogue")) {
            for (Vehicle element : vehicleList) {

                if (modelToCheck.equals(element.getModel())) {
                    if (element.getType().equals("car")) {
                        System.out.println("Type: Car");

                    } else if (element.getType().equals("truck")) {
                        System.out.println("Type: Truck");
                    }

                    System.out.printf("Model: %s\n", element.getModel());
                    System.out.printf("Color: %s\n", element.getColor());
                    System.out.printf("Horsepower: %d\n", element.getPower());
                    break;
                }
            }
            modelToCheck = scanner.nextLine();
        }
        double averageCarHp = carPower / carCounter;
        double averageTruckHp = truckPower / truckCounter;
        if (carCounter == 0) {
            averageCarHp = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", averageCarHp);
        if (truckCounter == 0) {
            averageTruckHp = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHp);


    }
}
