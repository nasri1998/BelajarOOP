package com.backend.batch26.model;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_employee")
public class Employee {
    @Id
    @Column( name="id")
    private int id;
    @Column( name = "first_name")
    private String firstName;
    @Column( name = "last_name")
    private String lastName;
    @Column( name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column( name = "address")
    private String address;
    // private int department_id;
    @Column( name = "salary")
    private int salary;
    @Column( name = "created_by")
    private int createdBy;
    @Column( name = "updated_by")
    private int updatedBy;
    @Column( name = "deleted_by")
    private int deletedBy;
    @Column( name = "created_on")
    private Timestamp createdOn;
    @Column( name = "updated_on")
    private Timestamp updatedOn;
    @Column( name = "deleted_on")
    private Timestamp deletedOn;
    @Column( name = "is_deleted")
    private boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Department departmentId;

    @OneToMany(mappedBy = "employee_id")
    private Set<TravelRequest> travelRequests;

    @OneToOne(mappedBy = "id")
    private User users;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
    public int getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
    public int getDeletedBy() {
        return deletedBy;
    }
    public void setDeletedBy(int deletedBy) {
        this.deletedBy = deletedBy;
    }
    public Timestamp getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }
    public Timestamp getUpdatedOn() {
        return updatedOn;
    }
    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }
    public Timestamp getDeletedOn() {
        return deletedOn;
    }
    public void setDeletedOn(Timestamp deletedOn) {
        this.deletedOn = deletedOn;
    }
    public boolean isDeleted() {
        return isDeleted;
    }
    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public User getUsers() {
        return users;
    }
    public void setUsers(User users) {
        this.users = users;
    }
    public Set<TravelRequest> getTravelRequests() {
        return travelRequests;
    }
    public void setTravelRequests(Set<TravelRequest> travelRequests) {
        this.travelRequests = travelRequests;
    }
    public Department getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }
    
    
}
