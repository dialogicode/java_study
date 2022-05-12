package me.study.ch15_lambda.ex1503_builtinInterface;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionEx {
	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계")
	};

	public static void main (String[] args) {
		System.out.print("학생명 : ");
		printString(t -> t.getName());

		System.out.print("전공 : ");
		printString(t -> t.getMajor());

		System.out.print("영어 점수 : ");
		printInt(t -> t.getEng());

		System.out.print("수학 점수 : ");
		printInt(t -> t.getMath());

		System.out.print("영어 점수 합계 : ");
		printTot(t -> t.getEng());

		System.out.print("수학 점수 합계 : ");
		printTot(t -> t.getMath());

		System.out.print("영어 점수 평균 : ");
		printAvg(t -> t.getEng());

		System.out.print("수학 점수 평균 : ");
		printAvg(t -> t.getMath());
	}

	static void printAvg (ToDoubleFunction<Student> f) {
		double sum = 0;
		for (Student s : list) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum / list.length);
	}

	static void printTot (ToIntFunction<Student> f) {
		int sum = 0;
		for (Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}

	static void printInt (Function<Student, Integer> f) {
		for (Student s : list) {
			System.out.print(f.apply(s) + " ");
		}
		System.out.println();
	}

	static void printString (Function<Student, String> f) {
		for (Student s : list) {
			System.out.print(f.apply(s) + " ");
		}
		System.out.println();
	}
}

/* Function 함수적 인터페이스 */
// 매개변수와 리턴값이 모두 있는 추상 메서드 apply 를 가지고 있는 인터페이스들

// ~<T,R>               R apply(T t)
// Bi~<T,U,R>           R apply(T t, U u)
// Int~<R>              R apply(int v)
// Double~<R>           R apply(double v)

// ToInt~<T>            int applyAsInt(T t)
// ToIntBi~<T,U>        int applyAsInt(T t, U u)
// LongToInt~           int applyAsInt(long v)
// DoubleToInt~         int applyAsInt(double v)

// ToLong~<T>           long applyAsLong(T t)
// ToLongBi~<T,U>       long applyAsLong(T t, U u)
// IntToLong~           long applyAsLong(int v)
// DoubleToLong~        long applyAsLong(double v)

// ToDouble~<T>         double applyAsDouble(T t)
// ToDoubleBi~<T,U>     double applyAsDouble(T t, U u)
// IntToDouble~         double applyAsDouble(int v)
// LongToDouble~        double applyAsDouble(long v)
