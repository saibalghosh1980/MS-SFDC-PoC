package com.cts.ms.location.eventhandler;

import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.cts.ms.events.enrollment.EnrollmentPublishEvent;
import com.cts.ms.events.location.LocationCreatedEvent;
import com.cts.ms.location.bl.LocationBL;
import com.cts.ms.location.bo.LocationBO;
import com.cts.ms.location.util.MessagePublisher;
import com.cts.util.ExceptionWrapper;
import com.cts.util.LoggingHelpUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@EnableBinding(Sink.class)
@Component
public class CreateLocationHandler {

	@Autowired
	@Qualifier("springManagedLocationBL")
	private LocationBL locationBL;

	@Autowired
	@Qualifier("springManagedMessagePublisher")
	private MessagePublisher messagePublisher;

	// @StreamListener(Sink.INPUT)

	@StreamListener(Sink.INPUT)
	public void listenToEnrollmentPublish(EnrollmentPublishEvent enrollmentPublishEvent) {
		try {
			LoggingHelpUtil.printDebug(
					"-----------------------RECIEVED ENROLLMENT PUBLISH EVENT------------------------------------------------");
			LoggingHelpUtil.printDebug(
					"-----------------------	CREATE LOCATION WITH INFORMATION FROM EVENT------------------------------------------------"
							+ new ObjectMapper().writeValueAsString(enrollmentPublishEvent));
			LocationBO locationBO = new LocationBO();
			locationBO.setLocationId(UUID.randomUUID());
			locationBO.setStartDate(new Date());
			locationBO.setEndDate(DateUtils.addDays(new Date(), 10));
			locationBL.addLocation(locationBO);
			// Publish the event to update the enrollment
			LoggingHelpUtil.printDebug("Publish the location created event");
			messagePublisher.publishMessage(
					new LocationCreatedEvent(enrollmentPublishEvent.getEnrollmentBO().getEnrollmentId(), locationBO));
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/*
	 * @ServiceActivator(inputChannel=Sink.INPUT) public void loggerSink(Object
	 * payload) { System.out.println("Received: " + payload); }
	 */

}