package me.study.ch16_stream.ex1604_process;

abstract public class Shape implements Comparable<Shape> {
	int x, y;

	public Shape () {
		this(0, 0);
	}

	public Shape (int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract public double area ();

	abstract public double length ();

	public String getLocation () {
		return "x: " + x + ", y: " + y;
	}

	@Override
	public int compareTo (Shape s) {
		return (int) (this.area() - s.area());
	}
}
