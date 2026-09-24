package com.sangamstore.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EnquiryRequestDTO {
	
	
	@NotBlank(message="Name is Required")
	@Size(max=100,message = "Name cannot exceed 100 characters")
	private String name;
	
	@NotBlank(message = "Contact is Required")
	@Size(max=100, message = "Contact cannot exceed 100 characters")
	private String contact;
	
	@NotBlank(message = "Message is Required")
	@Size(max=2000,message="Message canot exceed 2000 characters")
	private String message;
	
	public EnquiryRequestDTO() {
		
	}
	
	public EnquiryRequestDTO(String name, String contact, String message) {
		this.name=name;
		this.contact=contact;
		this.message=message;
	}
	
	
	//Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
