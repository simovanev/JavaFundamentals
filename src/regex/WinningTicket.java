package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input= scanner.nextLine().split(", ");
        String regex6="([@#^$])\\1{5}";
        Pattern pattern= Pattern.compile(regex);
        for (int i = 0; i < input.length; i++) {

            String first=input[i].substring(0,input[i].length()/2);
            String second=input[i].substring(0,input[i].length()/2);
            if ()

        }

    }
}
