package list;

import java.util.Scanner;

public class guineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayKg = Double.parseDouble(scanner.nextLine());
        double coverKg = Double.parseDouble(scanner.nextLine());
        double weightKg = Double.parseDouble(scanner.nextLine());
        double food=foodKg*1000;
        double hay=hayKg*1000;
        double cover=coverKg*1000;
        double weight=weightKg*1000;

        boolean notEnough = false;
        for (int i = 1; i <= 30; i++) {
            food -= 300;
            if (i % 2 == 0) {
                hay -= 0.05 * food;
            }
            if (i % 3 == 0) {
                cover -= weight / 3;
            }
            if (food <= 0 || hay <= 0 || cover <= 0) {
                notEnough = true;
                break;
            }

        }
        if (notEnough) {
            System.out.println("Merry must go to the pet store!");
        } else {

            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f."
                    , food/1000, hay/1000, cover/1000);
        }
    }
}
