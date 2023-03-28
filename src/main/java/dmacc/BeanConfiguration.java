/**
 *@author Uday F Chinhamora- ufchinhamora
 *CIS175 -Spring 2023
 *Mar 27, 2023
*/
package dmacc;

/**
 * @author uchin
 *
 */
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Player player() {
		Player bean = new Player("John Mell");
		//bean.setName("John Mell");
		//bean.setSport("Soccer");
		//bean.setPosition("Center Back");
		return bean;
	}

	@Bean
	public Team team() {
		Team bean = new Team("Rangers", "Des Moines", "IA");
		return bean;
	}
}
