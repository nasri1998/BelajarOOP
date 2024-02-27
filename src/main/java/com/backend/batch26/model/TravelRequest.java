package com.backend.batch26.model;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
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
    @OneToOne(mappedBy = "travelRequestId")
    @Column(name = "id")
    private TravelRequest id;

    // private int employee_id;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "request_status")
    private String requestStatus;
    @Column(name = "destination")
    private String destination;
    @Column(name = "remark")
    private String remark;
    // private int travel_type_id;
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
    @Column(name = "employee_id")
    private Employee employeeId;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    @Column(name = "travel_type_id")
    private TravelType travelTypeId; 
    
    public TravelRequest getId() {
        return id;
    }
    public void setId(TravelRequest id) {
        this.id = id;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public String getRequestStatus() {
        return requestStatus;
    }
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
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
    public Employee getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }
    public TravelType getTravelTypeId() {
        return travelTypeId;
    }
    public void setTravelTypeId(TravelType travelTypeId) {
        this.travelTypeId = travelTypeId;
    }
    
}
