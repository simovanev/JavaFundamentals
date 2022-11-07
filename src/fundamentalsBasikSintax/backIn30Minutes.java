package fundamentalsBasikSintax;

import java.util.Scanner;

public class backIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int total = hours * 60 + minutes + 30;
        int hoursAfter30 = total / 60;
        int minutesAfter30 = total % 60;
        if (hoursAfter30>23){
            hoursAfter30-=24;
        }
        System.out.printf("%d:%02d", hoursAfter30, minutesAfter30);
    }
}
