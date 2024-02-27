package com.backend.batch26.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_user")
public class User {
    @Id
    private int id;
    private String username;
    private String password;
    // private int role_id;
    private int created_by;
    private int updated_by;
    private int deleted_by;
    private Timestamp created_on;
    private Timestamp updated_on;
    private Timestamp deleted_on;
    private boolean is_deleted;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Role role_id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
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
    public Role getRole_id() {
        return role_id;
    }
    public void setRole_id(Role role_id) {
        this.role_id = role_id;
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
