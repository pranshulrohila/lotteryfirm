package com.lottery.entity;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LotteryUserLoginTo implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "UserName is mandatory")
	private String mobileNo;

	@NotBlank(message = "Password is mandatory")
	@Size(min = 5, max = 18, message = "The password '${validatedValue}' must be between {min} and {max} characters long")
	private String password;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
