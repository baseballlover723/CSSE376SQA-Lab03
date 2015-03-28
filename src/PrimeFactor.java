import java.util.ArrayList;


public class PrimeFactor {

	public static ArrayList<Integer> generate(int k) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		while (k % 2 == 0) {
			primes.add(2);
			k /= 2;
		}
		if (k > 1) {
			primes.add(k);
		}
		return primes;
	}
}
