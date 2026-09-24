package com.sangamstore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamstore.dto.EnquiryRequestDTO;
import com.sangamstore.dto.EnquiryResponseDTO;
import com.sangamstore.service.EnquiryService;

import jakarta.validation.Valid;

@CrossOrigin(origins="http://127.0.0.1:5500")
@RestController
@RequestMapping("/api/enquiry")
public class EnquiryController {
	private final EnquiryService enquiryService;
	
	public EnquiryController(EnquiryService enquiryService) {
		this.enquiryService=enquiryService;
	}
	
	//Create Eqnuiry
	//POST /api/enquiry/add
	@PostMapping("/add")
	public EnquiryResponseDTO createEnquiry(@Valid @RequestBody EnquiryRequestDTO request) {
		return enquiryService.createEnquiry(request);
	}
	
	//Get By Id GET
	//GET /api/enquiry/{id}
	@GetMapping("/{id}")
	public EnquiryResponseDTO getById(@PathVariable Long id) {
		return enquiryService.getById(id);
	}
	
	//Get All
	//GET /api/enquiry/all
	@GetMapping("/all")
	public List<EnquiryResponseDTO> getAllEnquiries(){
		return enquiryService.getAllEnquiries();
	}
	
	//Delete Enquiry
	//DELETE /api/enquiry/{id}
	@DeleteMapping("/{id}")
	public String deleteEnquiry(@PathVariable Long id) {
		enquiryService.deleteEnquiry(id);
		return "Enquiry Deleted Successfully..";
	}
	
	
}
