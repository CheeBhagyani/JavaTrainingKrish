//package chee.training.springdatajpaexample.modal;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class Course {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer cid;
//
//    private String name;
//
//    public Integer getCid() {
//        return cid;
//    }
//
//    public void setCid(Integer cid) {
//        this.cid = cid;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @ManyToMany(mappedBy = "courses")
//    private List<Student> studentList;
//
//}
