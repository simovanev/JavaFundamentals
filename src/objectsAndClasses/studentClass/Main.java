package objectsAndClasses.studentClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Student> studentList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input= scanner.nextLine();
            String firstName=input.split("\\s+")[0];
            String secondName=input.split("\\s+")[1];
            double score =Double.parseDouble(input.split("\\s+")[2]);
            Student currentPerson=new Student(firstName,secondName,score);
            studentList.add(currentPerson);

        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student item: studentList){
        System.out.println(item);

        }
    }
}
