package behavioural.command;

public class PrinterCommand implements Command {
	private final String content;

	public PrinterCommand(String content) {
		this.content = content;
	}

	@Override
	public void run() {
		System.out.print(content);
	}
}
