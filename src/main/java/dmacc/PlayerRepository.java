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
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories

public interface PlayerRepository  extends JpaRepository<Player, Long>{

}
