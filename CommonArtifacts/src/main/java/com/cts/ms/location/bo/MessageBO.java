package com.cts.ms.location.bo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageBO {
   private String messageId;
   private String message;
public String getMessageId() {
	return messageId;
}
@XmlElement
public void setMessageId(String messageId) {
	this.messageId = messageId;
}
public String getMessage() {
	return message;
}
@XmlElement
public void setMessage(String message) {
	this.message = message;
}
public MessageBO(String messageId, String message) {
	super();
	this.messageId = messageId;
	this.message = message;
}
public MessageBO() {
	super();
	// TODO Auto-generated constructor stub
}

}
