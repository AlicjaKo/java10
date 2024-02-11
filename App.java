
public class App {
    public static void main(String[] args) {
        Person john = new Person("John", 47);
        Person july = new Person("July", 4);
        Person sam = new Person("Sam", 53);

        System.out.println(john);
        System.out.println(july);
        System.out.println(sam);

        john.greeting();

        Car car = new Car(4, "Ford", "Focus");
        System.out.println(car);

        StudentRecord student1 = new StudentRecord(1222,"John", 5 );
        System.out.println(student1);

        StudentClass student2 = new StudentClass();
        student2.setGrade(3);
        student2.setId(3332);
        student2.setName("Maria");

        System.out.println(student2);
    }
    
}