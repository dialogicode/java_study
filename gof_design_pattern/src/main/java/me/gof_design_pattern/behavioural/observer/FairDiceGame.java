package me.gof_design_pattern.behavioural.observer;

import java.util.Iterator;
import java.util.Random;

public class FairDiceGame extends DiceGame {
	private final Random random = new Random();

	@Override
	public void play() {
		int diceNumber = random.nextInt(6) + 1;
		System.out.println("주사위 던졌다~ " + diceNumber);

		Iterator<Player> it = playerList.iterator();
		while (it.hasNext()) {
			it.next().update(diceNumber);

		}
	}
}
