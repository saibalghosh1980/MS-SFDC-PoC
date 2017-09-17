package com.cts.ms.location.bo;

import java.util.Date;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cts.ms.location.constants.LocationStatus;

@XmlRootElement(name = "LOCATION")
public class LocationBO {
	
	private UUID locationId;
	private String fullName;
	private LocationStatus status;
	private String state;
	private String city;
	private String zipCode;
	private String addressLine1;
	private Date startDate;
	private Date endDate;
	public UUID getLocationId() {
		return locationId;
	}
	@XmlElement
	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}
	public String getFullName() {
		return fullName;
	}
	@XmlElement
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocationStatus getStatus() {
		return status;
	}
	@XmlElement
	public void setStatus(LocationStatus status) {
		this.status = status;
	}
	public String getState() {
		return state;
	}
	@XmlElement
	public void setState(String state) {
		this.state = state;
	}
	@XmlElement
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	@XmlElement
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	@XmlElement
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public Date getStartDate() {
		return startDate;
	}
	@XmlElement
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	@XmlElement
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}	

}
