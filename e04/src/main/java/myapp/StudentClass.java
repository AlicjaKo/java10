package myapp;

import java.util.Objects;

public class StudentClass {
    private int id;
    private String name;
    private double grade;

    void setId(int i) {
        this.id = i;
    }
    void setName(String i) {
        this.name = i;
    }
    void setGrade(double i) {
        this.grade = i;
    }

    int getId() {
        return this.id;
    }
    String getName() {
        return this.name;
    }
    double getGrade() {
        return this.grade;
    }

    public StudentClass(int i, String n, double g) {
        this.id =i;
        this.name=n;
        this.grade=g;
    }
    public StudentClass() {

    }

    public String toString() {
        return "StudentClass{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }
    public int hashCode(){
        return Objects.hash(id, name, grade);
    }
    public boolean equals(final Object o) {
        if (this == o ) {
            return true;
        }
        if(o == null) {
        return false;
        }
        if (getClass() != o.getClass()) {
        return false;
        }

        StudentClass student = (StudentClass) o;
        return Objects.equals(id, student.id)
        && Objects. equals(name, student.name) && Objects. equals(grade, student.grade);
    }
}
