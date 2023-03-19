package org.tnsif.objectInjection;

public class Sim {
	//private data member
	private String simtype;
	private String company;
	
	//setters
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Sim [simtype=" + simtype + ", company=" + company + "]";
	}
	
	
	

}
