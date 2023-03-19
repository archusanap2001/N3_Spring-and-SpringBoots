package org.tnsif.autowiseexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tnsif.usingautowireannotation.Remote;

public class Executor {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("web.xml");
		Remote r=c.getBean("remote",Remote.class);
		r.remote();

	}

}
