package myapp;

public class Car {
    int numberOfSeats;
    Vehicle vehicle;

    public Car(String mak, String mod, int seatNumber){
        this.numberOfSeats = seatNumber;
        this.vehicle = new Vehicle(mak, mod);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void printCarDetails() {
        System.out.println("seats: " + this.numberOfSeats + "vehicle" + vehicle);
    }

    public String toString() {
        return "Car Make: " + vehicle.make() + ", Car Model: " + vehicle.model() + ", Number of Seats: " + this.numberOfSeats;
    }
}