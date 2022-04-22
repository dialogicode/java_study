package behavioural.iterator;

public interface Iterator {
	// 다음 구성 데이터를 얻을 수 있는지 여부 확인 메서드
	boolean next();

	// 구성 데이터를 하나 반환하는 메서드
	Object current();
}
