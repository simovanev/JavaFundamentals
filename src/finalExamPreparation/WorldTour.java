package finalExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder locations = new StringBuilder(scanner.nextLine());
        String changes = scanner.nextLine();
        while (!changes.equals("Travel")) {
            String command = changes.split("\\s*:\\s*")[0];
            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(changes.split("\\s*:\\s*")[1]);
                    String input = changes.split("\\s*:\\s*")[2];
                    if (locations.length() > index && index >= 0) {

                        locations.insert(index,input);

                    }
                    System.out.println(locations);
                    break;
                case "Remove Stop":
                    int starIndex = Integer.parseInt(changes.split("\\s*:\\s*")[1]);
                    int endIndex = Integer.parseInt(changes.split("\\s*:\\s*")[2]);
                    if (starIndex>=0 && locations.length() > starIndex && locations.length() > endIndex  && endIndex >= starIndex) {

                        locations.delete(starIndex, endIndex + 1);
                    }
                    System.out.println(locations);

                    break;
                case "Switch":
                    String old = changes.split("\\s*:\\s*")[1];
                    String newStr = changes.split("\\s*:\\s*")[2];
                    if (locations.toString().contains(old)) {
                        String travel = locations.toString();

                        locations = new StringBuilder(travel.replace(old, newStr));
                    }
                    System.out.println(locations);
                    break;
            }

            changes = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + locations);
    }
}
