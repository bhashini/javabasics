package com.busyqa.coursework.wk2_answer;

public class Book {
	private String title;
	private Author author;
	private double price;
	
	public Book(String title, String authorFirstName, String authorLastName, double price)
	{
		this.title = title;
		
		// *** HAVE TO CREATE A OBJECT OF AUTHOR
		this.author = new Author(authorFirstName, authorLastName);
		
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString()
	{
		return this.title + " by " + author.toString() + " for $ " + this.price;
	}
}
