import java.util.ArrayList;


public class PrimeNumberGenerator {

	// this is a prime number generator that i had wrote previously, 
	public static ArrayList<Long> generate(int numb){
		PrimeNumberFinder generator = new PrimeNumberFinder("primes.txt");
		System.out.println(numb);
		System.out.println(generator.findPrimesUnder(numb).toString());
		if (numb <= 5) {
			return old(numb);
		}
		return generator.findPrimesUnder(numb);
	}
	public static ArrayList<Long> old(int numb) {
		ArrayList<Long> primes = new ArrayList<Long>();
		if (numb > 2) {
			primes.add(2L);
		}
		if (numb > 3) {
			primes.add(3L);
		}
		for (int k=5; k < numb; k+=2) {
			if (isPrime(k)) {
				primes.add((long) k);
			}
		}
		return primes;
	}
	
	public static boolean isPrime(int numb) {
		for (int k=3; k<=Math.sqrt(numb);k++) {
			if (numb % k == 0) {
				return false;
			}
		}
		return true;
	}
}
