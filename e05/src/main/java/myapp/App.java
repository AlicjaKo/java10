package myapp;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {
        Student[] students = {
            new Student(1, "sam", 99.9),
            new Student(2, "Milly", 96.9),
            new Student(3, "Walter", 55.9)
        };
        printStudents(students);
        sortStudentsByGrade(students);
        System.out.println("Filtered Students with grade > 88:");
        Student[] filt = filterStudentsByGrade(students, 88);
        printStudents(filt);
        System.out.println("Avarage grade: " + findAverageGrade(students));
    }

    public static void printStudents(Student[] students) {
        System.out.println("Original list of students: ");
        for (int i =0; i<students.length; i++) {
            System.out.println("Student" + students[i]);
        }
    }

    public static void sortStudentsByGrade(Student[] students) {
        System.out.println("Sorted Students by grade: ");

        for (int i =0; i<(students.length-1); i++) {
            double s1 = students[i].grade();
            Student move = students[i];
            if (s1>students[i+1].grade()) {
                students[i] = students[i+1];
                students[i+1] = move;
            }
        }
        for (int i =0; i<(students.length-1); i++) {
            double s1 = students[i].grade();
            Student move = students[i];
            if (s1>students[i+1].grade()) {
                students[i] = students[i+1];
                students[i+1] = move;
            }
        }

        for (int i =0; i<students.length; i++) {
            System.out.println("Student" + students[i]);
        }

    }

    public static Student[] filterStudentsByGrade(Student[] students, double grade) {
        Student[] filtered = new Student[2];
        int r =0;
        for (int i =0; i<students.length; i++) {
            if (students[i].grade()>grade) {
                filtered[r]=students[i];
                r++;
            }
        }
        return filtered;
    }

    public static double findAverageGrade(Student[] students) {
        return (students[0].grade() +students[1].grade() + students[2].grade())/3;
    }
}
