package org.tnsif.collection;

import java.util.List;
import java.util.Set;

public class CollectionDemo {
	
	private List<String>contactNo;
	private Set<String>books;
	
	
	public List<String> getContactNo() {
		return contactNo;
	}
	public Set<String> getBooks() {
		return books;
	}
	
	public void display()
	{
		System.out.println("List of contactNo");
		for(String contact: contactNo);
		{
			System.out.println(contactNo);
		}
		System.out.println("List of books");
		for(String book: books);
		{
			System.out.println(books);
		}
	}
	
	
	

}
