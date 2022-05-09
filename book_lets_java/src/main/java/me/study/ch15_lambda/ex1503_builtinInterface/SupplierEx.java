package ch15_lambda.ex1503_builtinInterface;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx {
	public static void main (String[] args) {
		Supplier<String> s1 = () -> {
			return "홍길동";
		};
		System.out.println(s1.get());

		s1 = () -> "이순신";
		System.out.println(s1.get());

		IntSupplier s2 = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		System.out.println("주사위 : " + s2.getAsInt());

		DoubleSupplier s3 = () -> Math.PI;
		System.out.println("파이값 : " + s3.getAsDouble());
	}
}

/* Supplier 함수적 인터페이스 */
// 매개변수는 없고 리턴값이 있는 추상 메서드를 하나 가지고 있는 인터페이스들

// ~<T>         T get()
// Boolean~     boolean getAsBoolean()
// Int~         int getAsInt()
// Long~        long getAsLong()
// Double~      double getAsDouble()
