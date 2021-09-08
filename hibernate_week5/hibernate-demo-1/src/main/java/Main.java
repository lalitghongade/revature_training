import org.hibernate.cfg.Configuration;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import model.Player;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		//Player player=new Player("lala",22,"m","cricket","pune",987654321);
		//session.save(player);
		
		Query query=session.createQuery("from model.Player where city=:city order by id ");
		query.setString("city","pune");
		List<Player> playerList=query.list();
		
		for(Player p:playerList) {
			System.out.println(p);
		}
		
		
		
		transaction.commit();
		session.close();
		//s2.setEmail("somemail.com"); //Detached
		factory.close();
		
		
	}

}
