package methods;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String someText= scanner.nextLine();
        int repetitions=Integer.parseInt(scanner.nextLine());
        System.out.println(repo(someText,repetitions));
    }
    public  static  String repo( String a,int num){
        String result="";
        for (int i = 0; i < num; i++) {
            result += a;
        }return result;

        }
    }

