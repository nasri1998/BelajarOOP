package com.backend.batch26.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_m_role")
public class Role {
    @Id
    private int id;
    private String name;
    private int created_by;
    private int updated_by;
    private int deleted_by;
    private Timestamp created_on;
    private Timestamp updated_on;
    private Timestamp deleted_on;
    private boolean is_deleted;

    @OneToMany(mappedBy = "role_id")
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
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

    
}
