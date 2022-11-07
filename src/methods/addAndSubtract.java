package methods;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int firstInt=sum(first,second);
        System.out.println(subtract(firstInt,third));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }
}
