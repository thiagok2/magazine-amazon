package br.magazine.amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.magazine.amazon.model.Usuario;

public class App {
    public static void main( String[] args ){
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Usuario u = new Usuario();
		
		u.setNome("Thiago");
		u.setSenha("123456");
		
		manager.persist(u);
		
		tx.commit();
		manager.close();
		JPAUtil.close();
    }
}
