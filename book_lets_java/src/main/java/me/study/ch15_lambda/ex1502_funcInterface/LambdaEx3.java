package me.study.ch15_lambda.ex1502_funcInterface;

// 람다식으로 사용될 인터페이스를 만들 떄
// @FunctionalInterface 를 넣으면 두개 이상의 추상 메서드를 선언 못하게 된다
@FunctionalInterface
interface LambdaInterface3 {
	void print (String name);
}

public class LambdaEx3 {
	public static void main (String[] args) {
		LambdaInterface3 li3 = (String name) -> {
			System.out.println("제 이름은 " + name + "입니다.");
		};

		// 같은 표현
		// LambdaInterface3 li3 = name -> System.out.println("제 이름은 " +name+ "입니다.");
		// LambdaInterface3 li3 = (name) -> System.out.println("제 이름은 " +name+ "입니다.");
		// LambdaInterface3 li3 = (name) -> { System.out.println("제 이름은 " +name+ "입니다."); };

		li3.print("홍길동");
	}
}
