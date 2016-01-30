package br.com.sitedoPH.uniPH.infraestrutura.persistencia;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;


import br.com.sitedoph.uniph.dominio.entidade.Aluno;
import br.com.sitedoph.uniph.infraestrutura.persistencia.JPAUUtil;

public class PersisntenciaTest {

	@Test
	public void deveCriarOEntityManagerFactoryEEntityManager() {
		
				
		EntityManager em =  JPAUUtil.getEntityManager();
		
		em.close();
	}
	
	@Test
	public void devePresistirUmaluno() {
		
				
		EntityManager em =  JPAUUtil.getEntityManager();
		
		Aluno ze = new Aluno();
		ze.setNomeCompleto("Jose Roberto");
		ze.setCpf("999.999.999-99");
		ze.setDataDecadastro(Calendar.getInstance());
		ze.setEmail("ze@ze.com");
		ze.setTelefone("61 818181818");
		
		em.getTransaction().begin();
		em.persist(ze);
		em.getTransaction().commit();
		//HQL
		Query query = em.createQuery("SELECT a FROM Aluno a");
		
		List<Aluno> list = query.getResultList();
		
		for(Aluno a:list){
			System.out.println(a.getNomeCompleto());
		}
		
		em.close();
	}

}
