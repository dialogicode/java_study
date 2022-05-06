package me.gof_design_pattern.structural.proxy;

public class ScreenDisplay implements Display {
	@Override
	public void print(String content) {
		try {
			// 출력을 위한 준비 작업
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(content);
	}
}
