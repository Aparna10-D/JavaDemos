package com.objects.basics;

public class Book {

	String title, author, category;
	int price;
	
	public Book(String Title,String Author,String Category, int Price) {
		this.author = Author;
		this.title = Title;
		this.price = Price;
		this.category = Category;
	}
	
	public void getDetails() {
		System.out.println("Title of the book: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("Category: "+ category);
		System.out.println("Price: Rs."+ price);
	}
	
	public void checkBookType() {
		if(price > 500) {
			System.out.println("Book type is: Premium Book");
		}
		else {
			System.out.println("Book type is: Standard Book");
		}		
	}
}
