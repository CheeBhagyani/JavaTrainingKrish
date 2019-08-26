package com.company.chee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByStream {
    public static void main(String[] args) {
        //list with stream
        List<Student> students = Student.getStudent().stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
        System.out.println(students);

        //stream and lambda
        Student.getStudent()
                .stream().sorted((s1,s2) -> new Integer(s1.getId()).compareTo(s2.getId())).collect(Collectors.toList());
        System.out.println(students);

        //reverse sorting
        List<Student> studentList = Student.getStudent().stream().sorted((s1,s2) -> new Integer(-s1.getId()).compareTo(- s2.getId())).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
