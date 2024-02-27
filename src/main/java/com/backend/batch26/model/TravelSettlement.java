package com.backend.batch26.model;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class TravelSettlement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // private int travel_request_id;
    private int travel_fee;
    private int created_by;
    private int updated_by;
    private int deleted_by;
    private Timestamp created_on;
    private Timestamp updated_on;
    private Timestamp deleted_on;
    private boolean is_deleted;

    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private TravelRequest travel_request_id;
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTravel_request_id() {
        return travel_request_id;
    }
    public void setTravel_request_id(int travel_request_id) {
        this.travel_request_id = travel_request_id;
    }
    public int getTravel_fee() {
        return travel_fee;
    }
    public void setTravel_fee(int travel_fee) {
        this.travel_fee = travel_fee;
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
