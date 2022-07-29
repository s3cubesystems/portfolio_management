package com.s3cubesystems.usermanagement.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@ConfigurationProperties(value = "user-managment")
//@ConfigurationPropertiesBinding()
@Data

public class UserConfiguration {
	
	private int userid;
	private String firstName;
	private String lasttName;
	private String userEmail;
	private String userPassword;

}
