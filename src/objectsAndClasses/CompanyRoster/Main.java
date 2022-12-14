package objectsAndClasses.CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Company> teamList=new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String name = input.split(" ")[0];
            int salary = Integer.parseInt(input.split(" ")[1]);
            String position = input.split(" ")[2];
            String department = input.split(" ")[3];
            String email = "n/a";
            int age = -1;
            if (input.split(" ").length > 4) {
                email = input.split(" ")[4];

            }
            if (input.split(" ").length > 5) {
                age = Integer.parseInt(input.split(" ")[5]);
            }
            Company team = new Company(name, salary, position, department, email, age);
            teamList.add(team);

        }
        double maxSalary=0;
        String maxDepartment="";
        teamList.sort(Comparator.comparing(Company::getSalary).reversed());
        for (int i = 0; i < teamList.size(); i++) {
           String currentDep=teamList.get(i).getDepartment();
           double currentSalary=Double.parseDouble(teamList.get(i).getDepartment());
           int counter=1;
            for (int j = i+1; j < teamList.size(); j++) {
                if (teamList.get(j).getDepartment().equals(currentDep)){
                    currentSalary+=Double.parseDouble(teamList.get(j).getDepartment());
                    counter++;
                    //to be continued
                }
            }

        }
    }
}
