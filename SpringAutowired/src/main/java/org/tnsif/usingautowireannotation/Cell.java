package org.tnsif.usingautowireannotation;

public class Cell {
	
	private String company;
	private String size;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	//defoult constructor
	public Cell() {
		super();
	    System.out.println("defoult constructor for cell");
	}
	
	
	public void power() {
		System.out.println("company of a call:" +company);
		System.out.println("size of a cell:" +size);
		
	}
	
	}
	
	
