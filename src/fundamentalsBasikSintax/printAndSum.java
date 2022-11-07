package fundamentalsBasikSintax;

import java.util.Scanner;

public class printAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = star; i <=end ; i++) {
            sum+=i;
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.printf("Sum: %d",sum);
    }
}
