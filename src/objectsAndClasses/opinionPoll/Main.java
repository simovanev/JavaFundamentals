package objectsAndClasses.opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<People> peopleList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input= scanner.nextLine();
            String name= input.split(" ")[0];
            int age=Integer.parseInt(input.split(" ")[1]);
            if (age>30){
                People person= new People(name,age);
                peopleList.add(person);

            }

        }
        for (People element:peopleList){
            System.out.println(element);
        }
    }
}
