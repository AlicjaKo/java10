package myapp;

public record Person(String name, int age) {

    public String greeting() {
        return "Hello, my name is " + name +".";
    }
}