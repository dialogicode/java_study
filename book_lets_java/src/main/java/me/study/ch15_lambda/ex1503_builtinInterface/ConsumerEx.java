package ch15_lambda.ex1503_builtinInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {
	public static void main (String[] args) {

		Consumer<String> c1 = name -> System.out.println("제 이름은 " + name + "입니다.");
		c1.accept("홍길동");

		BiConsumer<String, String> c2 = (lastname, firstname) -> System.out.println("제 이름은 " + lastname + firstname + "입니다.");
		c2.accept("홍", "길동");

		DoubleConsumer c3 = score -> System.out.println("제 점수는 " + score + "입니다.");
		c3.accept(95.5);

		ObjIntConsumer<String> c4 = (lecture, i) -> System.out.println("제 " + lecture + " 점수는 " + i + "점 입니다.");
		c4.accept("국어", 100);
	}
}

/* Consumer 함수적 인터페이스 */
// 매개변수는 있고 리턴값이 없는 추상 메서드를 하나 가지고 있는 인터페이스들

// ~<T>             void accept(T t)
// Bi~<T,U>         void accept(T t, U u)

// Int~             void accept(int i)
// Long~            void accept(long l)
// Double~          void accept(double d)

// ObjDouble~<T>    void accept(T t, double d)
// ObjInt~<T>       void accept(T t, int i)
// ObjLong~<T>      void accept(T t, long l)
