package e02;
public record Person(String name, int age) {

    public void greeting() {
        System.out.println("Hi, my name is " + name);
    }
}