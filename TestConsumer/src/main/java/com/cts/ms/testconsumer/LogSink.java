package com.cts.ms.testconsumer;

import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class LogSink {
	
	@ServiceActivator(inputChannel=Sink.INPUT)
	public void loggerSink(Object payload) {
		System.out.println("Received: " + payload);
	}

}
