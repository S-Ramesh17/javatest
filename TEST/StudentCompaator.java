import java.util.*;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String name = parts[0];
            int marks = Integer.parseInt(parts[1]);
            students.add(new Student(name, marks));
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.marks != s2.marks) {
                    return Integer.compare(s1.marks, s2.marks);
                } else {
                    return s1.name.compareTo(s2.name);
                }
            }
        });

        for (Student student : students) {
            System.out.println(student.name + " " + student.marks);
        }
    }
}
