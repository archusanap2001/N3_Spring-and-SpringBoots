package org.tnsif.usingautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	private Cell cell;
   //DI using Setters
    @Autowired
    @Qualifier("c2")
    public void setCell(Cell cell) { 

		this.cell = cell;
	}
	//defoult constructor
	public Remote()
	{
		System.out.println("Defoult constructor for Remote");
	}
	//injecting the object of cell class
	public void remote() {
		 cell.power();
	}
	

}
