package me.gof_design_pattern.creational.singleton;

public class MainEntry {
	public static void main(String[] args) {
		// 싱글톤 생성자 호출 에러
		// King king = new King();

		// 싱글톤 객체 반환 메서드 호출
		King king = King.getInstance();

		king.say();

		King king2 = King.getInstance();

		if (king == king2) System.out.println("same object");
		else System.out.println("differnt object");

		System.out.println(king);
		System.out.println(king2);
	}
}
