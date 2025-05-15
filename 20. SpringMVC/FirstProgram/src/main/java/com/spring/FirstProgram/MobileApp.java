package com.spring.FirstProgram;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileApp {
	
	public static void main(String[]args) {
		ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");

		Sim sim1 = (Sim) Context.getBean("air");
		sim1.call();
		sim1.data();
		
		Sim sim2 = (Sim) Context.getBean("voda");
		sim2.call();
		sim2.data();
				
				

	}

}
