package org.setter.based.dependency.injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("setterBasedDI/setterBasedDI.xml");
		
		SimpleMovieLister  simpleMovieLister = context.getBean("simpleMovieSetterDI", SimpleMovieLister.class);
		simpleMovieLister.testSetterDI();
		System.out.println("Valeur ");
		System.out.println("Valeur branche papmalle_DevBranche");

	}

}
