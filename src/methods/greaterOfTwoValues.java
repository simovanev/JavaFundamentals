package methods;

import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String type= scanner.nextLine();
        if (type.equals("string")){
            String firstText= scanner.nextLine();
            String secondText= scanner.nextLine();
            System.out.println(getMax(firstText,secondText));
        } else if (type.equals("char")) {
            char firstChar=scanner.nextLine().charAt(0);
            char secondChar=scanner.nextLine().charAt(0);
            System.out.println(getMax(firstChar,secondChar));

        } else if (type.equals("int")) {
            int firstInt=Integer.parseInt(scanner.nextLine());
            int secondInt=Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstInt,secondInt));
        }
    }
    public  static String getMax( String a,String b){
        String result="";
        if (a.compareTo(b)>=0){
            result=a;
        }else result=b;
        return result;
    }
    public  static  char getMax(char a,char b){
        char result=' ';
        if (a>=b){
            result=a;
        }else result=b;
        return result;
    }
    public static int getMax( int a,int b){
        int result=0;
        if (a>=b){
            result=a;
        }else result=b;
        return result;
    }
}
