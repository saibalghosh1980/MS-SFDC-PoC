package com.cts.ms.enrollment.bl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.ms.enrollment.bo.EnrollmentBO;
import com.cts.ms.enrollment.repository.EnrollmentRepository;
import com.cts.ms.enrollment.util.EnrolllmentStatus;

@Service("springManagedEnrollmentBL")
public class EnrollmentBL {

	@Autowired
	@Qualifier("springManagedEnrollmentRepository")
	private EnrollmentRepository enrollmentRepo;

	
	public List<EnrollmentBO> getEnrollmentDataForProcessing() throws Exception {
		try {
			return enrollmentRepo.findByStatus(EnrolllmentStatus.UNTOUCHED.toString()).stream().map(e -> {
				EnrollmentBO enrollmentBO = new EnrollmentBO();
				enrollmentBO.setEnrollmentId(e.getEnrollmentid());
				enrollmentBO.setLocationId(e.getLocationid());
				enrollmentBO.setProgramId(e.getProgramid());
				enrollmentBO.setRejectReason(e.getReasonforreject());
				enrollmentBO.setStatus(EnrolllmentStatus.valueOf(e.getStatus()));
				enrollmentBO.setSublap(e.getSublap());
				return enrollmentBO;
			}).collect(Collectors.toList());
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}
	
	

}
