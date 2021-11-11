package ormdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setName("Rajesh");
		c1.setId(120);
		c1.setPhone(6876867);
		c1.setEmail("rajesh.kit@gmail.com");
		
		Customer c2=new Customer("rohini", 788, 4378688, "rohini@gmail.com");
		Customer c3=new Customer("sdgsg", 767, 23233, "fgdfsf@gmail.com");
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("customerunit");  
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin(); // Beginning of the JPA transaction
		em.persist(c2);
		em.persist(c1);
		em.persist(c3);
		em.getTransaction().commit(); // end of the JPA current transaction
	}
}
