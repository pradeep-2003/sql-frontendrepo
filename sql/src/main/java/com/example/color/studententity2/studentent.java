package com.example.color.studententity2;

import jakarta.persistence.*;

@Entity
@Table(name="Books")
public class studentent {

	@Id
	private int id;
	private String name;
	private String language;
	private String author;
	private int price;
	private String rating;
	
	
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
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	public studentent(int id, String name, String language, String author, int price, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.author = author;
		this.price = price;
		this.rating = rating;
	}
	public studentent() {
	
	}
	
}
