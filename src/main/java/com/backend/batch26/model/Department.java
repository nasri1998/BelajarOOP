package com.backend.batch26.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_department")
public class Department {
    @Id
    @Column(name="id")
    private int id;
    @Column(name = "name")
    private String name;
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

    @OneToMany(mappedBy = "departmentId")
    private Set<Employee> employees;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public Set<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
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

    
    
}
