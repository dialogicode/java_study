package ch15_lambda.ex1503_builtinInterface;

import java.util.function.Predicate;

public class PredicateEx {

	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계"),
			new Student("김유신", 100, 60, "컴공")
	};

	public static void main (String[] args) {

		// 과가 컴공인 학생의 영어 점수 평균
		double avg = avgEng(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 영어 점수 : " + avg);

		// 과가 컴공인 학생의 수학 점수 평균
		double avg2 = avgMath(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 수학 점수 : " + avg2);
	}

	private static double avgEng (Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			// equals 비교
			if (predicate.test(student)) {
				count++;
				sum += student.getEng();
			}
		}
		return (double) sum / count;
	}

	private static double avgMath (Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			// equals 비교
			if (predicate.test(student)) {
				count++;
				sum += student.getMath();
			}
		}
		return (double) sum / count;
	}
}

/* Predicate 함수적 인터페이스 */
// 매개변수가 있고 boolean 리턴값이 있는 인터페이스
// test 라는 이름을 가지는 메서드를 갖고 있다

// ~<T>         boolean test (T t)
// Bi~<T,U>     boolean test (T t, U u)

// Int~         boolean test (int v)
// Long~        boolean test (long v)
// Double~      boolean test (double v)
