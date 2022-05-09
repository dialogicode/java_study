package me.study.ch16_stream.ex1604_process;

public class Circle extends Shape {
	double r;

	Circle () {
		this(1);
	}

	public Circle (double r) {
		this.r = r;
	}

	@Override
	public double area () {
		return (r * r) * Math.PI;
	}

	@Override
	public double length () {
		return (r * 2) * Math.PI;
	}

	@Override
	public String toString () {
		return "넓이 : " + this.area();
	}
}
