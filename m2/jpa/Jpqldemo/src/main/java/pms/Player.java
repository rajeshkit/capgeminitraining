package pms;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playerdetails")
public class Player implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "playernerseyno")
	private int playerId; // persistent fields
	@Column(length = 10,nullable = false)
	private String playerName;// persistent fields
	private int totalRuns;// persistent fields
	@Column(name="franchiese")
	private String teamName;// persistent fields
	
	// entity class state can be persisteted via instance variable or
	public Player() {
		super();
	}
	
	public Player(int playerId, String playerName, int totalRuns, String teamName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.totalRuns = totalRuns;
		this.teamName = teamName;
	}

	public int getPlayerId() {//Persistent Properties
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {//Persistent Properties
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getTotalRuns() {//Persistent Properties
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	public String getTeamName() {//Persistent Properties
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", totalRuns=" + totalRuns
				+ ", teamName=" + teamName + "]";
	}
	
}
