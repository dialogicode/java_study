package me.gof_design_pattern.behavioural.interpreter;

import java.util.StringTokenizer;

public class Context {
	private StringTokenizer tokenizer;
	private String currentKeyword;
	
	public Context(String script) {
		tokenizer = new StringTokenizer(script);
		readNextKeyword();
	}

	public String readNextKeyword() {
		if (tokenizer.hasMoreTokens()){
			currentKeyword = tokenizer.nextToken();
		} else {
			currentKeyword = null;
		}

		return currentKeyword;
	}

	public String getCurrentKeyword() {
		return currentKeyword;
	}
}
