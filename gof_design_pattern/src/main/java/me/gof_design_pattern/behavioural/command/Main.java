package me.gof_design_pattern.behavioural.command;

public class Main {
	public static void main(String[] args) {
		CommandGroup cmdGroup = new CommandGroup();

		Command clearCmd = new ClearCommand();
		cmdGroup.add(clearCmd);
		//clearCmd.run();

		Command yellowColorCmd = new ColorCommand(ColorCommand.Color.YELLOW);
		cmdGroup.add(yellowColorCmd);
		//yellowColorCmd.run();

		Command moveCmd = new MoveCommand(10, 1);
		cmdGroup.add(moveCmd);
		//moveCmd.run();

		Command printCmd = new PrinterCommand("안녕하세요! 디자인패턴!");
		cmdGroup.add(printCmd);
		//printCmd.run();

		Command moveCmd2 = new MoveCommand(15, 5);
		cmdGroup.add(moveCmd2);
		//moveCmd2.run();

		cmdGroup.add(printCmd);
		//printCmd.run();

		Command moveCmd3 = new MoveCommand(25, 8);
		cmdGroup.add(moveCmd3);
		//moveCmd3.run();

		Command greenColorCmd = new ColorCommand(ColorCommand.Color.GREEN);
		cmdGroup.add(greenColorCmd);
		//greenColorCmd.run();

		cmdGroup.add(printCmd);
		//printCmd.run();

		cmdGroup.run();
	}
}
