import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student(8, "a" , "e"));
        students.add(new Student(5, "a" , "e"));
        students.add(new Student(6, "a" , "e"));
        students.add(new Student(2, "b" , "f"));
        students.add(new Student(4, "c" , "g"));
        students.add(new Student(3, "d" , "h"));
        students.add(new Student(1, "e" , "i"));

        System.out.println("Before \n");
        System.out.println(students);
    }
}
