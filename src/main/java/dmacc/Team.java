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
import jakarta.persistence.Embeddable;

@Embeddable
public class Team {
	private String team_name;
	private String city;
	private String state;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(String team_name, String city, String state) {
		super();
		this.team_name = team_name;
		this.city = city;
		this.state = state;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Team [team_name=" + team_name + ", city=" + city + ", state=" + state + "]";
	}

}
