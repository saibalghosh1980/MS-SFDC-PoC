package com.cts.ms.enrollment.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.cts.ms.enrollment.bl.EnrollmentBL;
import com.cts.util.ExceptionWrapper;
import com.cts.util.LoggingHelpUtil;

@Configuration
@EnableScheduling
public class EnrollmentScheduler {
	
	@Autowired
	@Qualifier("springManagedEnrollmentBL")
	private EnrollmentBL enrollmentBL;
	@Scheduled(fixedRate = 3600000)
	public void runEnrollmentDataScheduler(){
		
		try
		{
		LoggingHelpUtil.printDebug("----------------------------STARTED SCHEDULER----------------------------------------");
		enrollmentBL.getEnrollmentDataForProcessing();
		}
		catch(Exception ex){
			new ExceptionWrapper(ex);
		}
	}

}
