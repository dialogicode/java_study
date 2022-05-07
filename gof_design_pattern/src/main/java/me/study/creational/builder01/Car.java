package me.study.creational.builder01;

public class Car {
	private final String engine;
	private final boolean airbag;
	private final String color;
	private final boolean cameraSensor;
	private final boolean AEB;

	public Car(String engine, boolean airbag, String color, boolean cameraSensor, boolean AEB) {
		this.engine = engine;
		this.airbag = airbag;
		this.color = color;
		this.cameraSensor = cameraSensor;
		this.AEB = AEB;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("a CAR SPEC\n");
		sb.append("  CameraSensor " + (cameraSensor ? "Y" : "N") + "\n");
		sb.append("        Engine " + engine + "\n");
		sb.append("        Airbag " + (airbag ? "Y" : "N") + "\n");
		sb.append("         Color " + color + "\n");
		sb.append("           AEB " + (AEB ? "Y" : "N") + "\n");

		return sb.toString();
	}
}
