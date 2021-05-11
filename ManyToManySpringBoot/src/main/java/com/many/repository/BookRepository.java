package com.many.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.many.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> findAllDetails(int id);
	List<Book> findBookByPublisher(int publisher_id);
	
}
