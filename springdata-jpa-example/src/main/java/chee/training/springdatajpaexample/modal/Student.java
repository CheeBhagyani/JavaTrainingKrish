package chee.training.springdatajpaexample.modal;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Telephone> telephoneList;

    public List<Telephone> getTelephoneList() {
        return telephoneList;
    }

    public void setTelephoneList(List<Telephone> telephoneList) {
        this.telephoneList = telephoneList;
    }

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            joinColumns = { @JoinColumn (name = "sid") },
//            inverseJoinColumns = { @JoinColumn (name = "cid") }
//    )
//    List<Course> courseList;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
