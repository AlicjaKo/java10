package myapp;

public class App {
    public static void main(String[] args) {
    
        StudentRecord student1 = new StudentRecord(1222,"John", 5 );
        System.out.println(student1);

        StudentClass student2 = new StudentClass();
        student2.setGrade(3);
        student2.setId(3332);
        student2.setName("Maria");

        System.out.println(student2);
    }
    
}