package myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    void testSortStudentsByGrade() {
        Student[] students = {
                new Student(1, "Charlie", 85.4),
                new Student(2, "Alice", 88.5),
                new Student(3, "Bob", 92.3)
        };
        App.sortStudentsByGrade(students);

        assertEquals("Charlie", students[0].name());
        assertEquals("Alice", students[1].name());
        assertEquals("Bob", students[2].name());
    }

    @Test
    void testFilterStudentsByGrade() {
        Student[] students = {
                new Student(1, "Charlie", 85.4),
                new Student(2, "Alice", 88.5),
                new Student(3, "Bob", 92.3)
        };
        Student[] filtered = App.filterStudentsByGrade(students, 86);

        assertEquals(2, filtered.length);
        assertEquals("Alice", filtered[0].name());
        assertEquals("Bob", filtered[1].name());
    }

    @Test
    void testFindAverageGrade() {
        Student[] students = {
                new Student(1, "Charlie", 85.4),
                new Student(2, "Alice", 88.5),
                new Student(3, "Bob", 92.3)
        };
        double average = App.findAverageGrade(students);

        assertEquals((85.4 + 88.5 + 92.3) / 3, average, 0.01);
    }
}
