package com.cts.ms.location.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component("springManagedMessagePublisher")
@EnableBinding(Source.class)
public class MessagePublisher {

	private Source source;

	@Autowired
	public MessagePublisher(Source source) {
		this.source = source;
	}

	public void publishMessage(Object objectToPublish) {		
		source.output().send(MessageBuilder.withPayload(objectToPublish).build());
	}

}
