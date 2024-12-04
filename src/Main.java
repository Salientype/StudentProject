//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student aStudent = new Student("Jane", "Doe", 23, "Computer Science");
        Student bStudent = new Student("John", "Doe", 28, "Zoology");

        aStudent.displayDetails();
        aStudent.describeStudy();

        bStudent.displayDetails();
        bStudent.describeStudy();

    }
}