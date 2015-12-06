package org.springframework.samples.jpetstore.services;

import org.springframework.samples.jpetstore.dao.jpa.JpaAccountDao;
import org.springframework.samples.jpetstore.dao.jpa.JpaItemDao;

public class PetStoreServiceImpl extends AbstractServices implements PetStoreService {
	
	JpaAccountDao accountDao;
	JpaItemDao itemDao;
	
	
	public JpaAccountDao getAccountDao() {
		return accountDao;
	}
	public void setAccountDao(JpaAccountDao accountDao) {
		this.accountDao = accountDao;
	}
	public JpaItemDao getItemDao() {
		return itemDao;
	}
	public void setItemDao(JpaItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	


	public void affiche() {
		log.debug("Debut hello test -");
		// TODO Auto-generated method stub
		System.out.println("Hello Test yaya ");
		
		log.warn("Fin hello Test");
	}

}
