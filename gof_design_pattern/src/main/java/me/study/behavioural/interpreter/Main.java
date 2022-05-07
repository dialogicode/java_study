package me.study.behavioural.interpreter;

public class Main {
	public static void main(String[] args) {
		main2();
	}

	public static void main1() {
		String script = "BEGIN FRONT LOOP 2 BACK RIGHT END BACK END";

		Context context = new Context(script);

		while (true) {
			String keyword = context.getCurrentKeyword();
			if(keyword == null) break;

			System.out.println(keyword);

			context.readNextKeyword();
		}
	}

	public static void main2(){
		String script = "BEGIN FRONT LOOP 3 LOOP 2 RIGHT FRONT END LOOP 3 LEFT END BACK RIGHT END BACK END";
		System.out.println(script);

		Context context = new Context(script);

		Expression expression = new BeginExpression();

		if (expression.parse(context)) {
			System.out.println(expression);

			expression.run();
		}
	}
}
