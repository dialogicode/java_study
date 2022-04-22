package behavioural.strategy;

public class SimpleSumStrategy implements SumStrategy {

	@Override
	public int get(int n) {
		int sum = n;

		for (long i = 1; i<=n; i++){
			sum += i;
		}
		return sum;
	}
	
}
