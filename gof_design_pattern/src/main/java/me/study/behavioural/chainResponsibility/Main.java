package me.study.behavioural.chainResponsibility;

public class Main {
	public static void main(String[] args) {
		Handler handler1 = new ProtocolHandler();
		Handler handler2 = new DomainHandler();
		Handler handler3 = new PortHandler();

		handler1.setNext(handler3).setNext(handler2);

		String url = "http://www.youtube.com:1007";
		System.out.println("INPUT: " + url);

		handler1.run(url);
	}
}