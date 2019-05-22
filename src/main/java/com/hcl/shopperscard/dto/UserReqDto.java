package com.hcl.shopperscard.dto;

import javax.validation.constraints.NotNull;

public class UserReqDto {
	@NotNull
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
