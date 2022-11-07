package methods;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int area= calculateArea(a,b);
        System.out.println(area);
    }
    public static int calculateArea(int a,int b){
        return a*b;
    }
}
