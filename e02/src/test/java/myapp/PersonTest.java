package myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testGreeting() {
        // Setup
        Person person = new Person("Alice", 30);

        // Expected greeting message
        String expectedGreeting = "Hello, my name is Alice.";

        // Assertion
        assertEquals(expectedGreeting, person.greeting(), "The greeting message should match the expected format.");
    }

    @Test
    public void testGreetingWithDifferentName() {
        // Setup with a different name
        Person person = new Person("Bob", 25);

        // Expected greeting message for Bob
        String expectedGreeting = "Hello, my name is Bob.";

        // Assertion
        assertEquals(expectedGreeting, person.greeting(), "The greeting message should correctly include the person's name.");
    }
}
