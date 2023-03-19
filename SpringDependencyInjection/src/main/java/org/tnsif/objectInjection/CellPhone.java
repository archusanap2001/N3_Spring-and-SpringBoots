package org.tnsif.objectInjection;

public class CellPhone {
	//2.DI in the form of objects
	Charger charger;



	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	
	public void accept()
	{
		charger.power();
	}
	
	
	
	

}
