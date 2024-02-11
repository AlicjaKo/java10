package e03;
public class Car {
    int numberOfSeats;
    Vehicle vehicle;

    public Car(int seatNumber, String mak, String mod){
        this.numberOfSeats = seatNumber;
        this.vehicle = new Vehicle(mak, mod);
    }

    public String toString() {
        return "Make: " + vehicle.make() + " Model: " + vehicle.model() + " Number of seats: " + this.numberOfSeats;
    }
}
