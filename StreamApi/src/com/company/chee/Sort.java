package com.company.chee;

import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Student> students = Student.getStudent();

        Collections.sort(students, new StudentRanker());

        System.out.println(students);
    }
}

