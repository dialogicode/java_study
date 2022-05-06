package me.gof_design_pattern.behavioural.observer;

import java.util.LinkedList;

public abstract class DiceGame {
	protected final LinkedList<Player> playerList = new LinkedList<>();

	public void addPlayer(Player player) {
		playerList.add(player);
	}

	public abstract void play();
}
