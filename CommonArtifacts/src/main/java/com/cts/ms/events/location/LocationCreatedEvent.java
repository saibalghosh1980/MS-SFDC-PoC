package com.cts.ms.events.location;

import com.cts.ms.location.bo.LocationBO;

public class LocationCreatedEvent {
   private String enrollmentId;
   private LocationBO locationBO;
public String getEnrollmentId() {
	return enrollmentId;
}
public void setEnrollmentId(String enrollmentId) {
	this.enrollmentId = enrollmentId;
}
public LocationBO getLocationBO() {
	return locationBO;
}
public void setLocationBO(LocationBO locationBO) {
	this.locationBO = locationBO;
}
public LocationCreatedEvent(String enrollmentId, LocationBO locationBO) {
	super();
	this.enrollmentId = enrollmentId;
	this.locationBO = locationBO;
}
public LocationCreatedEvent() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
}
