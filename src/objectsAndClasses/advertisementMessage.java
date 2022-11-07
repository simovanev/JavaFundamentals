package objectsAndClasses;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class advertisementMessage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      int n=Integer.parseInt(scanner.nextLine());
        String[] phrases= {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String[] events={"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!" };
        String[] author={"Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"};
        String[] city ={"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random rdm=new Random();
        for (int i = 0; i < n; i++) {
            String currentPhrase= phrases[rdm.nextInt(phrases.length-1)];
            String currentEvent=events[rdm.nextInt(events.length-1)];
            String currentAuthor=author[rdm.nextInt(author.length-1)];
            String currentCity = city[rdm.nextInt(city.length-1)];
            System.out.println(currentPhrase+" "+currentEvent+" "+currentAuthor+" - "+currentCity);

        }

    }
}
