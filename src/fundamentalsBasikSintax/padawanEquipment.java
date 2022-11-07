package fundamentalsBasikSintax;

import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double money=Double.parseDouble(scanner.nextLine());
        int students =Integer.parseInt(scanner.nextLine());
        double lightsabersPrise=Double.parseDouble(scanner.nextLine());//+10% more
        double robesPrise=Double.parseDouble(scanner.nextLine());
        double beltsPrise=Double.parseDouble(scanner.nextLine());// every sixth is free

        double lightsabers = Math.ceil(1.1*students)*lightsabersPrise;
        double robes=students*robesPrise;
        double belts=(students-(students/6))*beltsPrise;
        if (money>=(lightsabers+robes+belts)){
            System.out.printf("The money is enough - it would cost %.2flv.",(lightsabers+robes+belts));
        }else System.out.printf("George Lucas will need %.2flv more.",(lightsabers+robes+belts)-money);

    }
}
