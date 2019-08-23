package com.company.chee;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static List<Student> getStudent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Chee"));
        students.add(new Student(2, "Dasuni"));
        students.add(new Student(3, "Limesha"));
        students.add(new Student(4, "Sajina"));
        students.add(new Student(5, "Amarabandu"));
        students.add(new Student(6, "Rupasinghe"));
        return students;
    }
}
