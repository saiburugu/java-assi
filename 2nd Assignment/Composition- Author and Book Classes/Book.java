package com.composition;

public class Book {
	String name;
	Author author;
	double price;
	int qty=0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Book(String name,Author author, double price, int qty)
	{
		this.name=name;
		this.author=author;
		this.price=price;
	    this.qty=qty;	
	}
	public Book() {
		
	}
	public String toString()
	{
		
		return "Book[" + "name:"  + name + ","+ author +",price:"+ price + ",qty:" + qty + "]";
	}

}
