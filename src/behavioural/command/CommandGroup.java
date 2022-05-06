package behavioural.command;

import java.util.ArrayList;

public class CommandGroup implements Command {
	private final ArrayList<Command> commands = new ArrayList<>();

	public void add(Command command) {
		commands.add(command);
	}

	@Override
	public void run() {
		int cntCommands = commands.size();
		for (int i = 0; i < cntCommands; i++) {
			Command command = commands.get(i);
			command.run();
		}
	}
}
