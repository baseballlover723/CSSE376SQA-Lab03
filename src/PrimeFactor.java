import java.util.ArrayList;


public class PrimeFactor {

	public static ArrayList<Integer> generate(int k) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (k > 1) {
			primes.add(k);
		}
		return primes;
	}
}
