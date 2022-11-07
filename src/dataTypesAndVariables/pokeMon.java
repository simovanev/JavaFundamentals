package dataTypesAndVariables;

import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        int M=Integer.parseInt(scanner.nextLine());
        int Y=Integer.parseInt(scanner.nextLine());
        int n=N;
        int pokes=0;
        while (n>=M){
            n-=M;
            pokes++;
            if (n*2==N){
                if (Y>0){
                n=n/Y;

                }
            }
        }
        System.out.println(n);
        System.out.println(pokes);
    }
}
