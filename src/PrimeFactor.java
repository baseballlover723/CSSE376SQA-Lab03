import java.util.ArrayList;


public class PrimeFactor {

	public static ArrayList<Integer> generate(int k) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (k == 2) {
			primes.add(2);
		}
		return primes;
	}
}
