package com.many.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Publisher_Details")
@NamedQueries(value= {
		@NamedQuery(name = "Publisher.findAllPublishersById",
		query = "SELECT p FROM Publisher p INNER Join p.books b where p.id=?1"),
		
		@NamedQuery(name = "Publisher.findAllPiblishersByBook",
		query = "SELECT p FROM Publisher p INNER Join p.books b where p.id=?1")})

public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(mappedBy = "publishers")
	private Set<Book> books;
	public Publisher() {
		super();
	}
	public Publisher(int id, String name, Set<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", books=" + books + "]";
	}

	
	
	

}
