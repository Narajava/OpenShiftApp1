/**
 * 
 */
package com.dhl.esb.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Nara
 * @version 1.0
 * @since 2021-04-10
 */
@RestController
public class MyTestController {
	
	@Value("${spring.profiles.active}")
	protected String activeProfile;
	
	 @Value("#{systemEnvironment['SPRING_ACTIVE_PROFILE']}")
	 private String myExternalProperty;
	
	@GetMapping("/NaraTest")
	public String getMsg() {
		System.out.println("Active Profile "+activeProfile);
		System.out.println("Hello Message");
		System.out.println("Hi Message");
		System.out.println("myExternalProperty "+myExternalProperty);
		System.out.println(System.getenv("SPRING_ACTIVE_PROFILE"));
		return "Hello World";
	}

}
