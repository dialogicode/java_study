package me.study.ch15_lambda.ex1503_builtinInterface;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class OperaterEx {

	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계"),
			new Student("김유신", 100, 60, "빅데이터")
	};

	public static void main (String[] args) {
		System.out.print("최대 수학 점수 : ");
		int max = maxOrMinMath((a, b) -> {
			if (a >= b) return a;
			else return b;
		});
		System.out.println(max);

		System.out.print("최소 수학 점수 : ");
		System.out.println(maxOrMinMath((a, b) -> (a <= b ? a : b)));

		System.out.print("최대 평균 점수 : ");
		System.out.println(maxOrMinAvg((a, b) -> (a >= b ? a : b)));

		System.out.print("최소 평균 점수 : ");
		System.out.println(maxOrMinAvg((a, b) -> (a <= b ? a : b)));
	}

	// 두 개의 int 값을 연산하여 int 값을 리턴
	private static int maxOrMinMath (IntBinaryOperator op) {
		int result = list[0].getMath();
		for (Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}

	// 두 개의 double 값을 연산하여 double 값을 리턴
	private static double maxOrMinAvg (DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng()) / 2.0;
		for (Student s : list) {
			result = op.applyAsDouble(result, (s.getMath() + s.getEng()) / 2.0);
		}
		return result;
	}
}
/* Operator 함수적 인터페이스 */
// 매개변수와 리턴값이 모두 있는 추상 메서드
// Function 인터페이스의 하위 인터페이스
// 보통 매개변수값을 연산하고 그 결과를 리턴하는 경우에 사용

// Unary~<T>        T apply (T t)
// Binary~<T>       T apply (T t1, T t2)

// IntUnary~        int applyAsInt (int)
// IntBinary~       int applyAsInt (int, int)

// LongUnary~       long applyAsLong (long)
// LongBinary~      long applyAsLong (long, long)

// DoubleUnary~     double applyAsDouble (double)
// DoubleBinary~    double applyAsDouble (double, double)
