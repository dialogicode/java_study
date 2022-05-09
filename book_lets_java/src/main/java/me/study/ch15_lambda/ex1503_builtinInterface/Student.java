package ch15_lambda.ex1503_builtinInterface;

// FunctionEx, OperatorEx, PredicateEx 에서 사용할 객체 클래스 정의

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;

	public Student (String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}

	public String getName () {
		return name;
	}

	public int getEng () {
		return eng;
	}

	public int getMath () {
		return math;
	}

	public String getMajor () {
		return major;
	}
}

// 자바의 표준 API에서 한개의 추상 메서드를 가진 인터페이스들은 모두 람다식을 사용할 수 있다.
// 람다에서 사용되는 함수적 인터페이스를 java.util.function 패키지에 설정하여 사용하고 있다.

// 종류
// Consumer     매개변수 O     리턴값 X
// Supplier     매개변수 X     리턴값 O
// Function     매개변수 O     리턴값 O
// Operator     매개변수 O     리턴값 O : 연산결과
// Predicate    매개변수 O     리턴값 O : Boolean
