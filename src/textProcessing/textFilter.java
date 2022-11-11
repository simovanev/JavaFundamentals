package textProcessing;

import java.util.Scanner;

public class textFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    String[] banWords= scanner.nextLine().split(", ");
    String text= scanner.nextLine();
    for (String item:banWords){
        text=text.replace(item,replacement(item));
    }
        System.out.println(text);
    }
    public static String replacement(String element){
        StringBuilder str=new StringBuilder();
        str.append("*".repeat(element.length()));
        return str.toString();
    }
}
