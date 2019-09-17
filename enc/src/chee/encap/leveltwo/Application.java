package chee.encap.leveltwo;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(school.new Student("chee"));
        school.addStudent(school.new Student("bhagyani "));
        school.getStudents();
    }
}
