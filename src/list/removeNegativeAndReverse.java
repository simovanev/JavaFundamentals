package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class removeNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        numbers.removeIf(n -> n < 0);
        Collections. reverse(numbers);
        if (numbers.size() > 0) {
            for (int element : numbers){
                System.out.print(element+" ");
            }
        }else System.out.println("empty");
    }
}
