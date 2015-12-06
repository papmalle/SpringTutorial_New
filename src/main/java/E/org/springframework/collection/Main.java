package E.org.springframework.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("E/complexCollection.xml");
		ComplexObject complexObject = context.getBean("moreComplexObject", ComplexObject.class);
		
		List<Object> lists = complexObject.getLists();
		System.out.println("Affiche Liste");
		for(Object data : lists){			
			System.out.println(data.toString());			
		}
		
	 System.out.println("Affiche Set ");
	 
	 Set<Object> set  = complexObject.getSets();
	 
	for(Object object : set){
		System.out.println(set.toString());
	}
		
		
		
		
		
		

	}

}
