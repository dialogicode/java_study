package creational.builder02;

public class Director {
	private final Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public String build() {
		StringBuilder sb = new StringBuilder();

		sb.append(builder.head());
		sb.append(builder.body());
		sb.append(builder.foot());

		return sb.toString();
	}
}
