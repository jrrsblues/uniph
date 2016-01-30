package br.com.sitedoPH.uniPH.infraestrutura.persistencia;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import br.com.sitedoph.uniph.infraestrutura.persistencia.JPAUUtil;

public class PersisntenciaTest {

	@Test
	public void deveCriarOEntityManagerFactoryEEntityManager() {
		
				
		EntityManager em =  JPAUUtil.getEntityManager();
		
		em.close();
	}

}
