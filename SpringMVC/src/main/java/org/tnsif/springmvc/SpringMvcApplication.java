package org.tnsif.springmvc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/*1.configuration:instruct that a spring configuration class is being used instead of Xml
  2.EnableAutoConfiguration: It is a Spring Boot annotation 
  3.ComponentScan: Scans project for spring component annotated with,@Service,@Respository,@Component*/
@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvcApplication.class, args);
		Scanner sc=new Scanner(System.in);
		/*int x=sc.nextInt();
		System.out.println(x);
		Employee e=context.getBean(Employee.class);
		e.setEmpid(10123);
		e.setEmpname("Archana sanap");
		e.print();*/
		HomeController h=context.getBean(HomeController.class);
		h.home();
		
	}

}
