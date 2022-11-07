package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entries = Integer.parseInt(scanner.nextLine());
        int[] sequence = new int[entries];
        for (int i = 0; i < entries; i++) {
            String word = scanner.nextLine();
            int vowelCounter = 0;
            int consonantCounter = 0;

            for (char symbol : word.toCharArray()) {
                if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'
               || symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U' ) {
                    vowelCounter += symbol * word.length();
                } else consonantCounter += symbol / word.length();
            }
            int result = vowelCounter + consonantCounter;

            sequence[i] = result;
        }
        Arrays.sort(sequence);
        for (int element: sequence){
            System.out.println(element);
        }
    }
}
