package me.gof_design_pattern.behavioural.strategy;

public class SumPrinter {
	void print(SumStrategy strategy, int n) {
		System.out.printf("The sum of 1 - %d : ", n);
		System.out.println(strategy.get(n));
	}
}