package com.backend.batch26.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_m_travel_type")
public class TravelType {
    @Id
    @Column(name="id")
    private Integer id;
    @Column( name = "name")
    private String name;
    @Column( name = "stock_availability")
    private Integer stockAvailability;
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

    @OneToMany(mappedBy = "travelType")
    private Set<TravelRequest> travelRequests;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    

    public Integer getStockAvailability() {
        return stockAvailability;
    }
    public void setStockAvailability(Integer stockAvailability) {
        this.stockAvailability = stockAvailability;
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
    public Set<TravelRequest> getTravelRequests() {
        return travelRequests;
    }
    public void setTravelRequests(Set<TravelRequest> travelRequests) {
        this.travelRequests = travelRequests;
    }

    
}
