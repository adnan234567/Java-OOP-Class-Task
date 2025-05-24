package Method_Overriding.CGPA;

public class CGPA {
    public static void main(String[] args) {
        String[] names = {"Dipto", "Alex", "John", "Mike", "Emma"};
        double[][] grades = {
                {3.5, 4.0, 3.8, 3.6, 3.9},
                {3.2, 3.8, 3.7, 3.9, 4.0},
                {3.9, 4.0, 3.6, 3.7, 3.8},
                {4.0, 3.9, 3.8, 3.7, 3.6},
                {3.5, 3.7, 3.8, 3.9, 4.0}
        };

        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            students[i] = new Student(names[i], grades[i]);
        }

        for (Student student : students) {
            student.displayCgpa();
        }
    }
}