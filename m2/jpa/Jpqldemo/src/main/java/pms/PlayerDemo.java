package pms;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PlayerDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("playerdata");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		//Player p = em.find(Player.class, 2); // always load the all columns 
		Query q = em.createQuery("update Player set playerName=?1,totalRuns=?2 where playerId=?3");
		q.setParameter(3, 3);
		q.setParameter(1, "Rajesh");
		q.setParameter(2, 50000);
		q.executeUpdate();
		
		Query q1 = em.createQuery("from Player");
		List<Player> list=q1.getResultList();
		list.forEach(e->System.out.println(e));

		em.getTransaction().commit();
		em.close();
		
	}
}
