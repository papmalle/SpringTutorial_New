package org.contructor.based.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("contructorBasedDI/contructorDI.xml");
		
		SimpleMovieLister  simpleMovieLister = context.getBean("simpleMovie", SimpleMovieLister.class);
		simpleMovieLister.calculeSimpleMovie(5, 8);
		
		ExampleBean2 exampleBean2 = context.getBean("exampleBean", ExampleBean2.class);
		exampleBean2.showAnswer();
		
		

	}

}
