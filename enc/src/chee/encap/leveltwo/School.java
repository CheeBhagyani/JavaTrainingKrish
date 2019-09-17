package chee.encap.leveltwo;

import java.util.ArrayList;

public class School {

    private ArrayList<Student> students = new ArrayList<>();

    public void getStudents() {
        for(Student student: students) {
            System.out.println(student.getName());
        }
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    class Student {

        public Student() {
        }

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
