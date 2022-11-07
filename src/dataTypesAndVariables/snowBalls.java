package dataTypesAndVariables;

import java.util.Scanner;

public class snowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balls = Integer.parseInt(scanner.nextLine());
        long bestBall=0;
        int bestSnow=0;
        int bestTime=0;
        int bestQuality=0;
        for (int i = 1; i <=balls ; i++) {
        int snow = Integer.parseInt(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        int quality = Integer.parseInt(scanner.nextLine());
        long ballQuality= (long) Math.pow(( snow/time),quality);

        if( ballQuality>=bestBall){
            bestBall=ballQuality;
            bestSnow=snow;
            bestTime=time;
            bestQuality=quality;
        }

        }
        System.out.printf("%d : %d = %d (%d)",bestSnow,bestTime,bestBall,bestQuality);
    }
}
