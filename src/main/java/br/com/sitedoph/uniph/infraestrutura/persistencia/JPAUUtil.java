package br.com.sitedoph.uniph.infraestrutura.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("uniph");
	
	public static EntityManager getEntityManager(){
		return emf.createEntityManager();
	}
	
}
