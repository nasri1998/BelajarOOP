package com.backend.batch26.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class TravelSettlement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    // private int travel_request_id;
    @Column( name = "travel_fee")
    private int travelFee;
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

    // @OneToOne(mappedBy = "id")
    // private TravelRequest travel_request_id;
    
    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    @Column(name = "travel_request_id")
    private TravelRequest travelRequestId;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
    public int getTravelFee() {
        return travelFee;
    }
    public void setTravelFee(int travelFee) {
        this.travelFee = travelFee;
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
    public TravelRequest getTravelRequestId() {
        return travelRequestId;
    }
    public void setTravelRequestId(TravelRequest travelRequestId) {
        this.travelRequestId = travelRequestId;
    }
    
    
}
