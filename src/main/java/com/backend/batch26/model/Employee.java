package com.backend.batch26.model;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_employee")
public class Employee {
    @Id
    private int id;
    private String first_name;
    private String last_name;
    private LocalDate date_of_birth;
    private String address;
    // private int department_id;
    private int salary;
    private int created_by;
    private int updated_by;
    private int deleted_by;
    private Timestamp created_on;
    private Timestamp updated_on;
    private Timestamp deleted_on;
    private boolean is_deleted;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Department department_id;

    @OneToMany(mappedBy = "employee_id")
    private Set<TravelRequest> travelRequest;

    public Set<TravelRequest> getTravelRequest() {
        return travelRequest;
    }
    public void setTravelRequest(Set<TravelRequest> travelRequest) {
        this.travelRequest = travelRequest;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }
    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getCreated_by() {
        return created_by;
    }
    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }
    public int getUpdated_by() {
        return updated_by;
    }
    public void setUpdated_by(int updated_by) {
        this.updated_by = updated_by;
    }
    public int getDeleted_by() {
        return deleted_by;
    }
    public void setDeleted_by(int deleted_by) {
        this.deleted_by = deleted_by;
    }
    public Timestamp getCreated_on() {
        return created_on;
    }
    public void setCreated_on(Timestamp created_on) {
        this.created_on = created_on;
    }
    public Timestamp getUpdated_on() {
        return updated_on;
    }
    public void setUpdated_on(Timestamp updated_on) {
        this.updated_on = updated_on;
    }
    public Timestamp getDeleted_on() {
        return deleted_on;
    }
    public void setDeleted_on(Timestamp deleted_on) {
        this.deleted_on = deleted_on;
    }
    public boolean isIs_deleted() {
        return is_deleted;
    }
    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }
    public Department getDepartment_id() {
        return department_id;
    }
    public void setDepartment_id(Department department_id) {
        this.department_id = department_id;
    }

    
}
