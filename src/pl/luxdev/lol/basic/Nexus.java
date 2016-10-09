package pl.luxdev.lol.basic;

import org.bukkit.Location;

import pl.luxdev.lol.types.TeamType;

public class Nexus {
	
	private int hp;
	private TeamType team;
	private Location location;
	private boolean destroyed;
	
	public Nexus(){
		
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public Location getLocation() {
		return location;
	}
	public boolean isDestroyed() {
		return destroyed;
	}
	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}
	public TeamType getTeam() {
		return team;
	}
	public void setTeam(TeamType t) {
		team = t;
	}
}
