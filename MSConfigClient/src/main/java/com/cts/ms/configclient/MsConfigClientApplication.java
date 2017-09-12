package com.cts.ms.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MsConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConfigClientApplication.class, args);
	}
	
	@RefreshScope
	@RestController
	class MessageRestController {

	    @Value("${message.greetings}")
	    private String message;

	    @RequestMapping("/message")
	    String getMessage() {
	        return this.message;
	    }
	}
}