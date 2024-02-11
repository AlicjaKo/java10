package myapp;

public class App {
    public static void main(String[] args) {
        Person john = new Person("John", 47);
        Person july = new Person("July", 4);
        Person sam = new Person("Sam", 53);

        System.out.println(john);
        System.out.println(july);
        System.out.println(sam);

        System.out.println(john.greeting());
    }
    
}