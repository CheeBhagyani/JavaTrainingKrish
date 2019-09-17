package chee.encap.levelfour;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.addCourses("math");
        student.addCourses(student.new Course("science"));
        student.addCourses(new Student().new Course("english"));

        student.getCourses();
    }
}
