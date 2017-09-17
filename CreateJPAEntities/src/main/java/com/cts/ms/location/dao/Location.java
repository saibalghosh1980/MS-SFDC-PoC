package com.cts.ms.location.dao;
// Generated Sep 17, 2017 1:00:28 PM by Hibernate Tools 4.0.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Location generated by hbm2java
 */
@Entity
@Table(name="location"
    ,catalog="`sfdc-poc-location`"
)
public class Location  implements java.io.Serializable {


     private String loationid;
     private String fullname;
     private String state;
     private String city;
     private String zipcode;
     private String addressline1;
     private Date startdate;
     private Date enddate;

    public Location() {
    }

	
    public Location(String loationid) {
        this.loationid = loationid;
    }
    public Location(String loationid, String fullname, String state, String city, String zipcode, String addressline1, Date startdate, Date enddate) {
       this.loationid = loationid;
       this.fullname = fullname;
       this.state = state;
       this.city = city;
       this.zipcode = zipcode;
       this.addressline1 = addressline1;
       this.startdate = startdate;
       this.enddate = enddate;
    }
   
     @Id 

    
    @Column(name="loationid", unique=true, nullable=false, length=50)
    public String getLoationid() {
        return this.loationid;
    }
    
    public void setLoationid(String loationid) {
        this.loationid = loationid;
    }

    
    @Column(name="fullname", length=1000)
    public String getFullname() {
        return this.fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    
    @Column(name="state", length=100)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="city", length=100)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="zipcode", length=100)
    public String getZipcode() {
        return this.zipcode;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    
    @Column(name="addressline1", length=100)
    public String getAddressline1() {
        return this.addressline1;
    }
    
    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="startdate", length=10)
    public Date getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="enddate", length=10)
    public Date getEnddate() {
        return this.enddate;
    }
    
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }




}

