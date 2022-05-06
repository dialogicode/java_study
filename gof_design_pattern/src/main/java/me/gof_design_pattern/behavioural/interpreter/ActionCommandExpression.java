package me.gof_design_pattern.behavioural.interpreter;

public class ActionCommandExpression extends CommandExpression{

	public ActionCommandExpression(String keyword) {
		super(keyword);
	}

	@Override
	public boolean parse(Context context) {
		if (!checkValidKeyword(keyword)) return false;

		if (context.readNextKeyword() == null) return false;

		return true;
	}

	public static boolean checkValidKeyword(String keyword) {
		boolean bKeywordOK = keyword.equals("FRONT") ||
				keyword.equals("BACK") || keyword.equals("LEFT") ||
				keyword.equals("RIGHT");

		return bKeywordOK;
	}

	@Override
	public boolean run() {
		System.out.println("cmd: " + keyword);
		return true;
	}

	@Override
	public String toString() {
		return keyword;
	}
	
	
}
