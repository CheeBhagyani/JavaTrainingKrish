package chee.rentcloud.ems.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Telephone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer teleId;
    String teleNumber;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Employee employee;

    public Integer getTeleId() {
        return teleId;
    }

    public void setTeleId(Integer teleId) {
        this.teleId = teleId;
    }

    public String getTeleNumber() {
        return teleNumber;
    }

    public void setTeleNumber(String teleNumber) {
        this.teleNumber = teleNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
