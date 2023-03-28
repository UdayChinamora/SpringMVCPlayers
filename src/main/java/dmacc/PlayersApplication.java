package dmacc;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class PlayersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayersApplication.class, args);
	
	
	/*
	 *ApplicationContext appContext = new
	* AnnotationConfigApplicationContext(BeanConfiguration.class);
	 
	 *Player c = appContext.getBean("player", Player.class);
	 
	  *System.out.println(c.toString());
	  */
	 
}

@Autowired
PlayerRepository repo;

public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
	//Using an existing bean
	Player c = appContext.getBean("contact", Player.class);
	c.setPosition("best friend");
	repo.save(c);
	
	//Create a bean to use - not managed by Spring
	Player d = new Player("Christiano Ronaldo", "Soccer", "Striker");
	Team a = new Team("Real Madrid", "Madrid", "Spain");
	d.setTeam(a);
	repo.save(d);
	
	List<Player> allMyPlayers = repo.findAll();
	for(Player people: allMyPlayers) {
		System.out.println(people.toString());
	}
	
	//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
	((AbstractApplicationContext) appContext).close();

}

}


