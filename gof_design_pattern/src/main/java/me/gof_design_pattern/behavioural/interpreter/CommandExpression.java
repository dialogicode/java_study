package me.gof_design_pattern.behavioural.interpreter;

public abstract class CommandExpression implements Expression{
	protected String keyword;

	public CommandExpression(String keyword) {
		this.keyword = keyword;
	}

	
}
