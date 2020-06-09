package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
//		Pessoa p1 = new Pessoa(null, "Lucas Santos", "lucasltj@hotmail.com");
//		Pessoa p2 = new Pessoa(null, "Tiago Santos", "tiagoltj@hotmail.com");
//		Pessoa p3 = new Pessoa(null, "Joao Santos", "joaoltj@hotmail.com");
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Busca usando o ID
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println(p);
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
		System.out.println("pronto");
		em.close();
		emf.close();

		
	}

}
