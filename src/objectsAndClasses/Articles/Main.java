package objectsAndClasses.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(", ");
        Articles artList = new Articles(text[0], text[1], text[2]);
        int changes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < changes; i++) {
            String command = scanner.nextLine();

            if (command.contains("Edit")) {
                artList.edit(command.split(": ")[1]);
            } else if (command.contains("ChangeAuthor")) {
                artList.changeAuthor(command.split(": ")[1]);
            } else if (command.contains("Rename")) {
                artList.rename(command.split(": ")[1]);
            }
        }
        System.out.println(artList);
    }
}
