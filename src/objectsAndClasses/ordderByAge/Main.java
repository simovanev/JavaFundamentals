package objectsAndClasses.ordderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<People> identity = new ArrayList<>();
        String person = scanner.nextLine();
        while (!person.equals("End")) {
            String[] personArr = person.split("\\s+");
            People currentSubject = new People(personArr[0], personArr[1], Integer.parseInt(personArr[2]));
            identity.add(currentSubject);

            person = scanner.nextLine();
        }
        identity.sort(Comparator.comparing(People::getAge));
        for (People item: identity){
            System.out.println(item);
        }
    }
}
