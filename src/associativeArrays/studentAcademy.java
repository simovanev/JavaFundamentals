package associativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<Double>> studentMAp = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            studentMAp.putIfAbsent(name, new ArrayList<>());
            studentMAp.get(name).add(grade);


        }
        LinkedHashMap<String,Double> averageGradeStudent=new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Double>> element : studentMAp.entrySet()) {
            String studentName= element.getKey();
            double studentGrade=averageGrade(element.getValue());
            if (studentGrade>=4.5){
                averageGradeStudent.put(studentName,studentGrade);
            }
        }
averageGradeStudent.entrySet().forEach(e-> System.out.println(e.getKey()+" -> "+e.getValue()));

    }
    private static Double averageGrade(ArrayList<Double> list){
        double sumGrade=0;
        for (Double item:list){
        sumGrade+=item;
        }
            return sumGrade/ list.size();
    }
}
