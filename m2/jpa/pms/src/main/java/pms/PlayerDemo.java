package pms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PlayerDemo {
	public static void main(String[] args) {
		Player p1=new Player(); // new state
		p1.setPlayerName("Kholi");
		p1.setTeamName("India");
		p1.setTotalRuns(57000);
		//EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("playerdata");
		//EntityManager
		EntityManager em=emf.createEntityManager();
		// transaction - begin
		em.getTransaction().begin();
		// JPA method persist
		Player p=em.find(Player.class, 3);
		p.setPlayerName("yuvraj");
		p.setTeamName("Australia");
		p.setTotalRuns(27000);
		em.remove(p1);
	//	System.out.println(p.getPlayerId() + " "+p.getPlayerName()+"  "+p.getTeamName()+" "+p.getTotalRuns() );
		// transaction - commit
		em.getTransaction().commit();
		em.close();
		
	}
}
