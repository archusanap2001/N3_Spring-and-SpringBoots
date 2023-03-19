package org.tnsif.autowiseexample;

public  class Bike {
	Petrol p;
	
    // DI using setters
	public void setP(Petrol p) {
		this.p = p;
	}
	
	public  void accept() {
		p.engine();
		
	}

	public Bike(Petrol p) {
		super();
		System.out.println("Autowire using constructor");
		this.p = p;
	}
	
	
	
	
	

}
