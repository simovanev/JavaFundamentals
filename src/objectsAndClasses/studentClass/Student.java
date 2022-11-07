package objectsAndClasses.studentClass;

public class Student {
    private String name;
    private String family;
    private double grade;

    public Student(String first, String second, double grade) {
        name = first;
        family = second;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",name,family,grade);
    }

    public double getGrade() {
        return this.grade;
    }
}
