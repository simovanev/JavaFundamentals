package arrays;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int stops=Integer.parseInt(scanner.nextLine());
        int [] passengerArr= new int[stops];
        int totalPeople=0;
        for (int i = 0; i < stops; i++) {
            passengerArr [i]=Integer.parseInt(scanner.nextLine());

        }
        for (int i = 0; i < stops; i++) {
            totalPeople+=passengerArr[i];
            System.out.print(passengerArr[i]+" ");
        }
        System.out.println("");
        System.out.println(totalPeople);
    }
}
