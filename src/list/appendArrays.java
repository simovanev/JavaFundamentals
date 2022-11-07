package list;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class appendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> theList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(theList);

        System.out.println(theList.toString().replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));
    }
}
