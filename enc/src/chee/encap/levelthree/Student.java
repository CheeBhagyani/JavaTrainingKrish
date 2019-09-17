package chee.encap.levelthree;

import java.util.ArrayList;

public class Student {
    class Course {

        public Course() {
        }

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Course(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public Student() {
    }

    public Student(ArrayList<Course> courses) {
        this.courses = courses;
    }

    private ArrayList<Course> courses = new ArrayList<>();

    public void getCourses() {
       for(Course course : courses) {
           validate(course.getName());
           System.out.println(course.getName());
       }
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourses(String name) {
        courses.add(new Course(name));
    }

    public void addCourses(Course course) {
        courses.add(course);
    }

    public void validate(String name) {
        class CourseValidator {
            public void nameValidate () {
                if ("math".equalsIgnoreCase(name)) {
                    System.out.println("valid");
                } else {
                    System.out.println("invalid");
                }
            }
        }
        new CourseValidator().nameValidate();
    }


}
