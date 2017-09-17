package com.cts.ms.events.enrollment;

import com.cts.ms.enrollment.bo.EnrollmentBO;

public class EnrollmentPublishEvent {
	
	private EnrollmentBO enrollmentBO;

	public EnrollmentBO getEnrollmentBO() {
		return enrollmentBO;
	}

	public void setEnrollmentBO(EnrollmentBO enrollmentBO) {
		this.enrollmentBO = enrollmentBO;
	}

	public EnrollmentPublishEvent(EnrollmentBO enrollmentBO) {
		super();
		this.enrollmentBO = enrollmentBO;
	}

	public EnrollmentPublishEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
