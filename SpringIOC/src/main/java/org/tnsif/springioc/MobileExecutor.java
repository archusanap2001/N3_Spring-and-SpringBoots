package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileExecutor {

	public static void main(String[] args) {
		//hard coding
		/*Airtel a=new Airtel();
		a.call();
		a.massage();
		
		Jio j=new Jio();
		j.call();
		j.massage();*/
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		/*Airtel a=(Airtel) c.getBean("airtel");	
		a.massage();*/
		
		/*Jio a=(Jio) c.getBean("jio");
		a.call();
		a.massage();*/
		
		Sim s=c.getBean("sim",Sim.class);
		s.call();
		s.massage();
	}

}
