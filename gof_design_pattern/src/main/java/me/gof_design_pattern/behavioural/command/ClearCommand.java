package me.gof_design_pattern.behavioural.command;

public class ClearCommand implements Command {
	@Override
	public void run() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
