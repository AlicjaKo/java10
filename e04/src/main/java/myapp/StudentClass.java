package myapp;

import java.util.Objects;

public class StudentClass {
    private int id;
    private String name;
    private int grade;

    void setId(int i) {
        this.id = i;
    }
    void setName(String i) {
        this.name = i;
    }
    void setGrade(int i) {
        this.grade = i;
    }

    int getId() {
        return this.id;
    }
    String getName() {
        return this.name;
    }
    int getGrade() {
        return this.grade;
    }

    public String toString() {
        return "Student id: " +id+ " student name: " +name+ " student grade: "+grade;
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
