package fundamentalsBasikSintax;

import java.util.Scanner;

public class ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String stage = " ";

        if (age <= 2) {
            stage = "baby";
        } else if (age <= 13) {
            stage = "child";
        } else if (age <= 19) {
            stage = "teenager";
        } else if (age<=65) {
            stage="adult";
        }else stage="elder";
        System.out.printf("%s",stage);
    }
}
