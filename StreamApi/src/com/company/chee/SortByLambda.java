package com.company.chee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByLambda {
    public static void main(String[] args) {
        List<Student> students = Student.getStudent();
        Comparator<Student> studentComparator = (s1, s2) -> (s1.getId()<s2.getId()?-1:(s1.getId()>s2.getId()?1:0));
        Collections.sort(students, studentComparator);
        System.out.println(students);
    }
}
