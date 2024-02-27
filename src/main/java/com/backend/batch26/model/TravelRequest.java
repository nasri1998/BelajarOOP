package com.backend.batch26.model;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tr_travel_request")
public class TravelRequest {
    @Id
    private int id;
    // private int employee_id;
    private LocalDate start_date;
    private LocalDate end_date;
    private String request_status;
    private String destination;
    private String remark;
    // private int travel_type_id;
    private int created_by;
    private int updated_by;
    private int deleted_by;
    private Timestamp created_on;
    private Timestamp updated_on;
    private Timestamp deleted_on;
    private boolean is_deleted;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Employee employee_id;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private TravelType travel_type_id;

    @OneToOne(mappedBy = "travel_request_id")
    private Set<TravelSettlement> travelSettlement;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public LocalDate getStart_date() {
        return start_date;
    }
    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }
    public LocalDate getEnd_date() {
        return end_date;
    }
    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }
    public String getRequest_status() {
        return request_status;
    }
    public void setRequest_status(String request_status) {
        this.request_status = request_status;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
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
