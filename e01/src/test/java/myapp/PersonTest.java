package myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testPersonRecord() {
        String expectedName = "Alice";
        int expectedAge = 30;
        Person person = new Person(expectedName, expectedAge);

        assertEquals(expectedName, person.name(), "The name should match the constructor argument.");
        assertEquals(expectedAge, person.age(), "The age should match the constructor argument.");
    }

    @Test
    public void testPersonRecordToString() {
        Person person = new Person("Bob", 25);
        String expectedToString = "Person[name=Bob, age=25]";

        assertEquals(expectedToString, person.toString(), "The toString() method should match the expected format.");
    }
}
