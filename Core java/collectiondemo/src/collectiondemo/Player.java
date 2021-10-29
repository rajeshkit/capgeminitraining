package collectiondemo;
public class Player implements Comparable<Player>{
	private int playerId;
	private String playerName;
	private String countryName;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", countryName=" + countryName + "]";
	}
	@Override
	public int compareTo(Player o) {
		if(this.playerId>o.playerId) {
			return 1;
		}
		if(this.playerId<o.playerId) {
			return -1;
		}
		return 0;
	}
	
	
}
