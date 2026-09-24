package com.sangamstore.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sangamstore.entity.Enquiry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class EnquiryRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	//Save
	public Enquiry save(Enquiry enquiry) {
		entityManager.persist(enquiry);
		return enquiry;
	}
	
	//Find Enquiry By Id
	public Enquiry findById(Long id) {
		return entityManager.find(Enquiry.class, id);
	}
	
	//Find All Enquiries
	public List<Enquiry> findAll(){
		String jpql = " SELECT e FROM Enquiry e";
		return entityManager.createQuery(jpql,Enquiry.class).getResultList();
	}
	
	//Delete Enquiry
	public void delete(Enquiry enquiry) {
		entityManager.remove(enquiry);
	}
	
	
}
