package atm.nic.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Entity{
	
	public EntityManager getEntityManager(){
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("minha-persistence-unit");
		return  emf.createEntityManager();
	}
}
