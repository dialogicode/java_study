package creational.builder02;

public class Main {
	public static void main(String[] args) {
		// 동일한 Data 객체 이용해 다양한 형식의 문자열 생성

		// Facade 패턴 적용 - Director 클래스
		// Builder 메서드의 사용을 단순화 시켜줌

		// Builder의 추상 메서드를 파생 클래스에서 구현화
		// template method 패턴

		// strategy 패턴 - 원하는 상황에 적용

		Data data = new Data("Jane", 25);

		Builder builder = new PlainTextBuilder(data);
		Director director = new Director(builder);
		String result = director.build();
		System.out.println(result);

		builder = new JSONBuilder(data);
		director = new Director(builder);
		result = director.build();
		System.out.println(result);

		builder = new XMLBuilder(data);
		director = new Director(builder);
		result = director.build();
		System.out.println(result);
	}
}
