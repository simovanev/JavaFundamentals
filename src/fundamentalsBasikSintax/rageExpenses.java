package fundamentalsBasikSintax;

import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrise = Double.parseDouble(scanner.nextLine());
        double mousePrise = Double.parseDouble(scanner.nextLine());
        double keyboardPrise = Double.parseDouble(scanner.nextLine());
        double displayPrise = Double.parseDouble(scanner.nextLine());
        int headset = 0;
        int mouse = 0;
        int keyboard = 0;
        int display = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                headset++;
            }
            if (i % 3 == 0) {
                mouse++;
            }
            if (i % 6 == 0) {
                keyboard++;
            }
            if (i % 12 == 0) {
                display++;
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", headset * headsetPrise + mouse * mousePrise + keyboard * keyboardPrise + display * displayPrise);
    }
}
