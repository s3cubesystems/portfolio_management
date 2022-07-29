package com.s3cubesystems.usermanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private int userid;
	private String firstName;
	private String lasttName;
	private String userEmail;
	private String userPassword;

}
