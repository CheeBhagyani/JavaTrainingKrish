import java.util.*;

public class SortStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(8, "Chee" , "r"));
        students.add(new Student(2, "Bhagyani" , "d"));
        students.add(new Student(3, "Dasuni" , "a"));

//        System.out.println("Before \n");
//        for(Student student: students ) {
//            List<Student> studentList = new ArrayList<>();
//            studentList.add(student);
//        }
//        System.out.println(students);
//
//        System.out.println("\n After \n");
//        List<Student> sortStudentList = new ArrayList<>();
//        for(Student student: students ) {
//            sortStudentList.add(student);
//            student.compareTo(sortStudentList);
//        }
//        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);
    }
//        Comparator<Student> studentComparator = (s1, s2) -> (s1.getId()< s2.getId()?-1:s1.getId()>s2.getId()?1:0);
//        Collections.sort(students,studentComparator);
//        System.out.println("After" +students);
//    }


}
