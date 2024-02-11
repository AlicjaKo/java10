package myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void testCarCreation() {
        // Create an instance of Car
        Car car = new Car("Toyota", "Camry", 5);

        // Assertions to verify the Vehicle part is correctly set up
        assertEquals("Toyota", car.getVehicle().make(), "The make of the vehicle should be Toyota.");
        assertEquals("Camry", car.getVehicle().model(), "The model of the vehicle should be Camry.");

        // Assertions to verify the Car-specific attribute
        assertEquals(5, car.getNumberOfSeats(), "The number of seats should be 5.");
    }

    @Test
    public void testCarDetailsPrinting() {
        // Setup
        Car car = new Car("Ford", "Mustang", 4);
        String expectedOutput = "Car Make: Ford\nCar Model: Mustang\nNumber of Seats: 4";

        // Testing would go here if printCarDetails() returned a String.
       car.printCarDetails();
    }

    @Test
    public void testCarDetailsToString() {
        // Setup
        Car car = new Car("Ford", "Mustang", 4);
        String expectedOutput = "Car Make: Ford, Car Model: Mustang, Number of Seats: 4";

        // Testing would go here if printCarDetails() returned a String.
        assertEquals(expectedOutput,  car.toString());

    }
}
