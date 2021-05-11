package com.many.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Book_Details")

@NamedQueries(value= {
		@NamedQuery(name = "Book.findAllDetails",
		query = "SELECT b FROM Book b INNER Join b.publishers p where b.bookId=?1"),
		
		@NamedQuery(name = "Book.findBookByPublisher",
		query = "SELECT b FROM Book b Join b.publishers p where p.id=?1")})

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name ="book_publisher",joinColumns =@JoinColumn(name = "book_id",referencedColumnName = "id"),
	inverseJoinColumns =@JoinColumn(name = "publisher_id",referencedColumnName = "id")) 
	private Set<Publisher> publishers;
	
	public Book() {
		super();
	}

	public Book(int id, String name, Set<Publisher> publishers) {
		super();
		this.id = id;
		this.name = name;
		this.publishers = publishers;
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

	public Set<Publisher> getPublishers() {
		return publishers;
	}

	public void setPublishers(Set<Publisher> publishers) {
		this.publishers = publishers;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publishers=" + publishers + "]";
	}
	

	
}
