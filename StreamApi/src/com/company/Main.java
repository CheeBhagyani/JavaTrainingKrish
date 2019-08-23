package com.company;

import com.company.chee.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    static void filterByStream() {
        System.out.println(Student.getStudent().stream().filter(student -> student.getName().length() > 5).collect(Collectors.toList()));
    }

    static void filterByUsual() {
        List<Student> studentList = Student.getStudent();

        for ( Student student : studentList) {

            if(student.getName().length() > 5) {
                System.out.println(student.getName());
            }
        }

    }

    static void processByStreamApi() {
        Student.getStudent().stream()
                .map(s -> new Student(s.getId(), "Dr " + s.getName()))
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s.getName()));
    }

    static void getMax() {
        System.out.println(Student.getStudent().stream()
                .max(Comparator.comparing(Student::getId)).get().getId());
    }

    static void getMin() {
        System.out.println(Student.getStudent().stream()
                .min(Comparator.comparing(Student::getId)).get().getId());
    }

    static void getCount() {
        System.out.println(Student.getStudent().stream().count());
    }

    public static void main(String[] args) {
        System.out.println("filter using regular method");
        filterByUsual();

        System.out.println("\n filter using stream api");
        filterByStream();

        System.out.println("\n process using stream api");
        processByStreamApi();

        System.out.println("\n max id:");
        getMax();

        System.out.println("\n min id:");
        getMin();

        System.out.println("\n student count :");
        getCount();
    }
}
