package myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudentTest {
    @Test
    public void testStudentRecord() {
        // Create an instance of StudentRecord
        StudentRecord studentRecord = new StudentRecord(1, "Alice", 95.5);

        // Assertions to verify the record's functionality
        assertEquals(1, studentRecord.id(), "The ID should match the constructor argument.");
        assertEquals("Alice", studentRecord.name(), "The name should match the constructor argument.");
        assertEquals(95.5, studentRecord.grade(), "The grade should match the constructor argument.");
    }

    @Test
    public void testStudentClass() {
        // Create an instance of StudentClass
        StudentClass studentClass = new StudentClass(2, "Bob", 88.0);

        // Assertions to verify the class's functionality
        assertEquals(2, studentClass.getId(), "The ID should match the constructor argument.");
        assertEquals("Bob", studentClass.getName(), "The name should match the constructor argument.");
        assertEquals(88.0, studentClass.getGrade(), "The grade should match the constructor argument.");
    }

    @Test
    public void testStudentClassEquals() {
        // Create two instances of StudentClass with the same data
        StudentClass student1 = new StudentClass(3, "Charlie", 92.0);
        StudentClass student2 = new StudentClass(3, "Charlie", 92.0);

        // Test equality
        assertEquals(student1, student2, "Two instances with the same data should be considered equal.");
    }

    @Test
    public void testStudentRecordEquals() {
        // Create two instances of StudentRecord with the same data
        StudentRecord studentRecord1 = new StudentRecord(4, "Dana", 93.5);
        StudentRecord studentRecord2 = new StudentRecord(4, "Dana", 93.5);

        // Test equality
        assertEquals(studentRecord1, studentRecord2, "Two instances with the same data should be considered equal.");
    }

    @Test
    public void testStudentClassToString() {
        // Create an instance of StudentClass
        StudentClass student = new StudentClass(2, "Bob", 88.0);

        // Expected toString output
        String expectedToString = "StudentClass{id=2, name='Bob', grade=88.0}";

        // Assert that the toString method returns the expected string
        assertEquals(expectedToString, student.toString(), "The toString() output should match the expected format.");
    }

    @Test
    public void testStudentClassHashCode() {
        // Create two instances of StudentClass with the same data
        StudentClass student1 = new StudentClass(3, "Charlie", 92.0);
        StudentClass student2 = new StudentClass(3, "Charlie", 92.0);

        // Assert that two objects with the same data return the same hash code
        assertEquals(student1.hashCode(), student2.hashCode(), "Hash codes of two equal objects should be the same.");

        // Create another instance with different data
        StudentClass student3 = new StudentClass(4, "Dana", 93.5);

        // Assert that objects with different data return different hash codes
        assertNotEquals(student1.hashCode(), student3.hashCode(),
                "Hash codes of two different objects should not be the same.");
    }
}
