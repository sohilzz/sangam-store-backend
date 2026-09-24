package com.sangamstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sangamstore.dto.EnquiryRequestDTO;
import com.sangamstore.dto.EnquiryResponseDTO;
import com.sangamstore.entity.Enquiry;
import com.sangamstore.repository.EnquiryRepository;
//import jakarta.transaction.Transactional;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnquiryService {
	
	private final EnquiryRepository enquiryRepository;
	
	public EnquiryService(EnquiryRepository enquiryRepository) {
		this.enquiryRepository=enquiryRepository;
	}
	
	//Create Query
	//POST
	@Transactional
	public EnquiryResponseDTO createEnquiry(EnquiryRequestDTO request) {
		
		//DTO -> Entity
		Enquiry enquiry = new Enquiry();
		enquiry.setName(request.getName());
		enquiry.setContact(request.getContact());
		enquiry.setMessage(request.getMessage());
		
		//save Entity
		Enquiry savedEnquiry = enquiryRepository.save(enquiry);
		
		//Entity -> ResponseDTO
		return convertToResponseDTO(savedEnquiry);
	}
	
	//Get Enquiry By Id
	@Transactional(readOnly = true)
	public EnquiryResponseDTO getById(Long id) {
		Enquiry enquiry = enquiryRepository.findById(id);
		
		if(enquiry == null) {
			throw new RuntimeException("Enquiry Not Found with Id :"+id);
		}
		return convertToResponseDTO(enquiry);
	}
	
	//GET All Enquiry
	@Transactional(readOnly = true)
	public List<EnquiryResponseDTO> getAllEnquiries(){
		List<Enquiry> enquiries = enquiryRepository.findAll();
		return enquiries.stream().map(this::convertToResponseDTO).toList(); 
	}
	
	//Delete 
	@Transactional
	public void deleteEnquiry(Long id) {
		Enquiry enquiry = enquiryRepository.findById(id);
		if(enquiry == null) {
			throw new RuntimeException("Enquiry Not Found with Id :"+id);
		}
		enquiryRepository.delete(enquiry);
	}
	
	//Convert Entity->ResponseDTO
	private EnquiryResponseDTO convertToResponseDTO(Enquiry enquiry) {
		return new EnquiryResponseDTO(
				enquiry.getId(),
				enquiry.getName(),
				enquiry.getContact(),
				enquiry.getMessage(),
				enquiry.getCreatedAt(),
				enquiry.getStatus()
				);
	}
	
	
}
