package textProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] filePath= scanner.nextLine().split("\\\\");
        String fullFileName=filePath[filePath.length-1];
        String name=fullFileName.split("\\.")[0];
        String extension=fullFileName.split("\\.")[1];
        System.out.printf("File name: %s\n",name);
        System.out.printf("File extension: %s\n",extension);


    }
}
