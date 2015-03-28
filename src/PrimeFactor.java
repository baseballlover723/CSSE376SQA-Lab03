import java.util.ArrayList;

public class PrimeFactor {

	public static ArrayList<Integer> generate(int k) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int divisor = 2; k > 1; divisor++) {
			while (k % divisor == 0) {
				primes.add(divisor);
				k /= divisor;
			}
		}
		return primes;
	}
}
