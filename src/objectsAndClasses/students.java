package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {
    static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String homeTown;

        public String getFirstName() {
            return this.firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }

        public Student(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String person = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();
        while (!person.equals("end")) {
            String[] personArr = person.split(" ");
            Student currentStudent = new Student(personArr[0], personArr[1], personArr[2], personArr[3]);
            boolean isInTheList=false;
            for (Student item : studentList) {
                if (item.getFirstName().equals(currentStudent.getFirstName())
                        && item.getLastName().equals(currentStudent.getLastName())) {
                    item.setAge(currentStudent.getAge());
                    item.setHomeTown(currentStudent.getHomeTown());
                    isInTheList=true;
                }
            }if (!isInTheList){
            studentList.add(currentStudent);

            }
            person = scanner.nextLine();
        }
        String town = scanner.nextLine();
        for (Student item : studentList) {
            if (item.getHomeTown().equals(town)) {
                System.out.printf("%s %s is %s years old\n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }

    }
}
