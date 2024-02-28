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
    private Integer id;
    @OneToOne(mappedBy = "travelRequest")
    private TravelSettlement travelSettlement;
    // @Column(name = "id")

    // @OneToOne
    // @JoinColumn(name = "id", nullable = false)
    // private TravelSettlement travelSettlement;

    // private Integer employee_id;
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
    // private Integer travel_type_id;
    @Column( name = "created_by")
    private Integer createdBy;
    @Column( name = "updated_by")
    private Integer updatedBy;
    @Column( name = "deleted_by")
    private Integer deletedBy;
    @Column( name = "created_on")
    private Timestamp createdOn;
    @Column( name = "updated_on")
    private Timestamp updatedOn;
    @Column( name = "deleted_on")
    private Timestamp deletedOn;
    @Column( name = "is_deleted")
    private Boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "travel_type_id", nullable = false)
    private TravelType travelType; 
    
    
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
    public void setDeleted(Boolean isDeleted) {
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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public TravelType getTravelType() {
        return travelType;
    }
    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }
    public TravelSettlement getTravelSettlement() {
        return travelSettlement;
    }
    public void setTravelSettlement(TravelSettlement travelSettlement) {
        this.travelSettlement = travelSettlement;
    }
    
    
}
