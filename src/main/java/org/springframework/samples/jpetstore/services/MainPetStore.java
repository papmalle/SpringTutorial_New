package org.springframework.samples.jpetstore.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.samples.jpetstore.services.PetStoreService;

public class MainPetStore {

	private static ApplicationContext context = null;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext(new String[]{"petStoreDI/services.xml", "petStoreDI/daos.xml"});
	
		PetStoreService service = context.getBean("petStoreAlias", PetStoreService.class);
		
		service.affiche();
		
		
		
		
		
		
	}

}
