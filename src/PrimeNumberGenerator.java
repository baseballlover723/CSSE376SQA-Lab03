import java.util.ArrayList;


public class PrimeNumberGenerator {

	public static ArrayList<Integer> generate(int numb){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (numb > 2) {
			primes.add(2);
		}
		if (numb > 3) {
			primes.add(3);
		}
		for (int k=5; k < numb; k+=2) {
			if (isPrime(k)) {
				primes.add(k);
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
