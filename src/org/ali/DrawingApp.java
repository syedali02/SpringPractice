package org.ali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
			//context.registerShutdownHook();
			Shape shape=(Shape) context.getBean("circle");
			shape.draw();
			//System.out.println(context.getMessage("greeting",null,"Default value",null));			
		
	}

}    
