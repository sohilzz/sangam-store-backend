package com.sangamstore.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name="enquiry")
public class Enquiry {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String contact;
	@Column(nullable = false , columnDefinition="Text")
	private String message;
	@Column(nullable = false)
	private LocalDateTime createdAt;
	@Column(nullable = false)
	private String status;
	
	public Enquiry() {
		
	}
	
	public Enquiry(String name , String contact, String message) {
		this.name=name;
		this.contact=contact;
		this.message=message;
	}

	@PrePersist
	public void onCreat() {
		this.createdAt=LocalDateTime.now();
		if(this.status==null) {
			this.status="NEW";
		}
		
	}

	
	//Getter Setter
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreateAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

	
}
