package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class midExam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phoneList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String whatToDo = scanner.nextLine();
        while (!whatToDo.equals("End")) {

            String command = whatToDo.split(" - ")[0];
            switch (command) {
                case "Add":
                    String phoneName = whatToDo.split(" - ")[1];
                    if (!phoneList.contains(phoneName)) {

                        phoneList.add(phoneName);
                    }
                    break;
                case "Remove":
                    String phoneToRemove = whatToDo.split(" - ")[1];
                    if (phoneList.contains(phoneToRemove)) {

                        phoneList.remove(phoneToRemove);
                    }
                    break;
                case "Bonus phone":
                    String bonus = whatToDo.split(" - ")[1];
                    String oldPhone = bonus.split(":")[0];
                    String newPhone = bonus.split(":")[1];
                    for (int i = 0; i < phoneList.size(); i++) {
                        if (phoneList.get(i).equals(oldPhone)) {
                            phoneList.add(i + 1, newPhone);
                            break;
                        }
                    }
                    break;
                case "Last":
                    String phoneToAdd = whatToDo.split(" - ")[1];
                    if (phoneList.contains(phoneToAdd)) {
                        phoneList.remove(phoneToAdd);
                        phoneList.add(phoneToAdd);
                    }
                    break;

            }
            whatToDo = scanner.nextLine();
        }
        for (int i = 0; i < phoneList.size() - 1; i++) {
            System.out.print(phoneList.get(i) + ", ");
        }
        System.out.println(phoneList.get(phoneList.size() - 1));
    }
}

