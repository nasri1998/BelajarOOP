package com.backend.batch26.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_user")
public class User {
    @Id
    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    @Column(name = "id")
    private Employee id;
    @Column(name = "username")
    private String username;
    @Column(name="password")
    private String password;
    // private int role_id;
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
    @Column( name = "role_id")
    private Role roleId;

   
    public Employee getId() {
        return id;
    }
    public void setId(Employee id) {
        this.id = id;
    } 
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // public int getRole_id() {
    //     return role_id;
    // }
    // public void setRole_id(int role_id) {
    //     this.role_id = role_id;
    // }
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
    public Role getRoleId() {
        return roleId;
    }
    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }
    
   
}
