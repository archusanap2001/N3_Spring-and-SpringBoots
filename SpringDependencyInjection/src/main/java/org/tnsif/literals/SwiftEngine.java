package org.tnsif.literals;

public class SwiftEngine implements IEngine {
	
	private String Company;
	private double cost;
    public double cost() {
    	return cost;
    }
    public String display() {
    	return "Japan";
    	
    	
    }
    
	
	public void setCompany(String company) {
		this.Company = company;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	//DI using constructor
	public SwiftEngine(String company, double cost) {
		super();
		Company = company;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Origin of company:" +Company+ fuel;
	}
	
    

}
