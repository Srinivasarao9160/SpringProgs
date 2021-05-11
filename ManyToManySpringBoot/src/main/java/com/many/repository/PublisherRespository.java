package com.many.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.many.entity.Publisher;

public interface PublisherRespository extends JpaRepository<Publisher, Integer> {
	
	List<Publisher> findAllPublishersById(int publisher_id);
	List<Publisher> findAllPiblishersByBook(int book_id);
	

}
