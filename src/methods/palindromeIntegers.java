package methods;

import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        while (!number.equals("END")) {
            if (backNum(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            number = scanner.nextLine();
        }
    }

    public static boolean backNum(String num) {
        char[] element = num.toCharArray();
        boolean isSpecial = false;
        for (int i = 0; i < element.length; i++) {
            if (element[i] == element[element.length - 1 - i]) {
                isSpecial = true;
            }else isSpecial=false;
        }
        return isSpecial;
    }
}
