package com.cts.ms.enrollment.bo;

import com.cts.ms.enrollment.util.EnrolllmentStatus;

public class EnrollmentBO {

	private String enrollmentId;
	private String programId;
	private String locationId;
	private EnrolllmentStatus status = EnrolllmentStatus.UNTOUCHED;
	private String sublap;
	private String rejectReason;

	public String getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(String enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
    
	
	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getSublap() {
		return sublap;
	}

	public void setSublap(String sublap) {
		this.sublap = sublap;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public EnrolllmentStatus getStatus() {
		return status;
	}

	public void setStatus(EnrolllmentStatus status) {
		this.status = status;
	}

}
