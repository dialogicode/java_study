package behavioural.strategy;

public class SimpleSumStrategy implements SumStrategy {

	@Override
	public int get(int n) {
		int sum = 0;

		for (long i = 1; i<=n; i++){
			sum += i;
		}
		return sum;
	}
	
}
