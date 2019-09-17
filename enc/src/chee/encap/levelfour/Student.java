package chee.encap.levelfour;

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

    private ArrayList<Course> courses = new ArrayList<>();

    public ArrayList<Course> getCourses() {
        return courses;
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

    public void validate(String color) {
        new Object() {
            public void nameValidate () {
                if ("math".equalsIgnoreCase(color)) {
                    System.out.println("valid");
                } else {
                    System.out.println("invalid");
                }
            }
        }.nameValidate();
    }


}
