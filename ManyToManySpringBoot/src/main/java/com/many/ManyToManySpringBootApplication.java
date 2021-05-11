package com.many;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.many.entity.Book;
import com.many.entity.Publisher;
import com.many.repository.BookRepository;
import com.many.repository.PublisherRespository;

@SpringBootApplication
public class ManyToManySpringBootApplication {

	@Autowired
	private BookRepository bookdao;
	@Autowired
	private PublisherRespository publisherdao;
	
	public static void main(String[] args) {
		SpringApplication.run(ManyToManySpringBootApplication.class, args);
		
		}
	private void saveManytoManyTableData() {
		Publisher publisher
	}

}
