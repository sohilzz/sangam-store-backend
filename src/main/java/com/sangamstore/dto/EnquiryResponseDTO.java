package com.sangamstore.dto;

import java.time.LocalDateTime;

public class EnquiryResponseDTO {

	private Long id;
	private  String name;
	private String contact;
	private String message;
	private LocalDateTime createdAt;
	private String status;
	
	public EnquiryResponseDTO() {
		
	}
	
	public EnquiryResponseDTO(Long id , String name, String contact, String message, LocalDateTime createdAt, String status) {
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.message=message;
		this.createdAt=createdAt;
		this.status=status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public LocalDateTime getCreateAt() {
		return createdAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createdAt = createAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
