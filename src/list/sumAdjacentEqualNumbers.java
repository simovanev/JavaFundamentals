package list;

import javax.security.sasl.SaslClient;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (Objects.equals(numbers.get(i), numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinedByDelimiter(numbers, " "));

    }

    public static String joinedByDelimiter(List<Double> nums, String delimiter) {
        String output = "";
        DecimalFormat ft = new DecimalFormat("0.#");
        for (Double num : nums) {

            output += ft.format(num) + delimiter;
        }
        return output;
    }
}
