package dataTypesAndVariables;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfBuckets=Integer.parseInt(scanner.nextLine());
        int capacity=255;

        for (int i = 0; i <numberOfBuckets ; i++) {
            int water=Integer.parseInt(scanner.nextLine());

            if (capacity>=water){
                capacity-=water;
            }else System.out.println("Insufficient capacity!");


        }
        System.out.println(255-capacity);
    }
}
