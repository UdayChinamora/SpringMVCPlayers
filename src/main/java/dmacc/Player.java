/**
 *@author Uday F Chinhamora- ufchinhamora
 *CIS175 -Spring 2023
 *Mar 27, 2023
*/
package dmacc;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
/**
 * @author uchin
 *
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	private int id ;
	private String name;
	private String sport;
	private String position;
	@Autowired
private Team team;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
		this.position = "";
	}
	
	public Player(String name) {
		super();
		this.name = name;
	}
	public Player(String name, String sport, String position) {
		super();
		this.name = name;
		this.sport = sport;
		this.position = position;
	}
	public Player(int id, String name, String sport, String position) {
		super();
		this.id = id;
		this.name = name;
		this.sport = sport;
		this.position = position;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", sport=" + sport + ", position=" + position
				+ ", team=" + team + "]";
	}
}
