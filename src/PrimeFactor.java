import java.util.ArrayList;

public class PrimeFactor {

	public static ArrayList<Integer> generate(int k) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int divisor = 2;
		while (k > 1) {
			while (k % divisor == 0) {
				primes.add(divisor);
				k /= divisor;
			}
			divisor++;
		}
		if (k > 1) {
			primes.add(k);
		}
		return primes;
	}
}
