package pl.luxdev.lol.basic.game;

import org.bukkit.Location;

import pl.luxdev.lol.type.TeamType;

public class Nexus {
	
	private int hp;
	private TeamType team;
	private Location location;
	private boolean destroyed;
	
	public Nexus(){
		
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location l) {
		location = l;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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
