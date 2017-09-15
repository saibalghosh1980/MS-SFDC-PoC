package com.cts.ms.enrollment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.ms.enrollment.dao.Enrollment;

@Repository("springManagedEnrollmentRepository")
public interface EnrollmentRepository extends JpaRepository<Enrollment, String> {
	
	@Query("select e from Enrollment e where e.status = :status")
	List<Enrollment> findByStatus(@Param("status") String status);

}