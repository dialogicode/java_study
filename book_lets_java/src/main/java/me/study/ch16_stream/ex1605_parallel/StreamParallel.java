package me.study.ch16_stream.ex1605_parallel;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel {
	public static void main (String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}

		long start = System.nanoTime();
		// stream() 순차적 스트림 처리
		list.stream().forEach(a -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		long end = System.nanoTime();
		System.out.println("순차 스트림 처리 시간 : " + (end - start) + "nano sec");

		start = System.nanoTime();
		// parallelStream() 병렬 스트림 처리
		list.parallelStream().forEach(a -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		end = System.nanoTime();
		System.out.println("병렬 스트림 처리 시간 : " + (end - start) + "nano sec");
	}
}

/* 스트림 병렬 처리 */
// 스트림 객체를 생성할 때 stream() 대신 parallelStream() 메소드를 사용하면 병렬 스트림을 쉽게 생성할 수 있다
// 병렬 처리시 전체 요소를 서브 요소로 나누고, 서브 요소를 개별 쓰레드로 처리한다.
// 이 서브 요소들의 처리 결과를 결합하여 최종 처리 결과를 반환하게 된다.

// isParallel() 메서드로 병렬 여부를 확인할 수 있다.

/* 순차 처리와 병렬 처리의 차이 */
// 순차 처리가 빠른 경우 : CPU 코어 수가 적을 수록,
//          요소의 수가 적거나 요소처리 시간이 짧을 수록,
//          병렬 처리에서 추가적으로 발생하는 스레드를 생성하는 시간이 길수록
// 병렬 처리가 빠른 경우 : CPU 코어 수가 많을 수록,
//          요소의 수가 많거나 요소처리 시간이 길수록,
//          더 많은 연산이 일어나거나 각요소의 데이터 수가 많으면 많을수록
