package com.backend.batch26.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TravelSettlement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column( name = "travel_fee")
    private Integer travelFee;
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

    // @OneToOne(mappedBy = "travelSettlement")
    // private TravelRequest travelRequest;
    
    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private TravelRequest travelRequest;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Integer getTravelFee() {
        return travelFee;
    }
    public void setTravelFee(Integer travelFee) {
        this.travelFee = travelFee;
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
    
    public TravelRequest getTravelRequest() {
        return travelRequest;
    }
    public void setTravelRequest(TravelRequest travelRequest) {
        this.travelRequest = travelRequest;
    }
    
    
}
