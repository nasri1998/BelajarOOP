package com.backend.batch26.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.Nullable;


@Entity
@Table(name = "tb_m_role")
public class Role {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name ="name")
    private String name;
    @Column( name = "created_by")
    @Nullable
    private Integer createdBy;
    @Nullable
    @Column( name = "updated_by")
    private Integer updatedBy;
    @Column( name = "deleted_by")
    @Nullable
    private Integer deletedBy;
    @Column( name = "created_on")
    @Nullable
    private Timestamp createdOn;
    @Column( name = "updated_on")
    @Nullable
    private Timestamp updatedOn;
    @Column( name = "deleted_on")
    @Nullable
    private Timestamp deletedOn;
    @Column( name = "is_deleted")
    @Nullable
    private Boolean isDeleted;

    @OneToMany(mappedBy = "role")
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
    public Integer getId() {
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
    public Integer getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
    public Integer getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }
    public Integer getDeletedBy() {
        return deletedBy;
    }
    public void setDeletedBy(Integer deletedBy) {
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
    public Boolean isDeleted() {
        return isDeleted;
    }
    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    

    
}
