import java.util.ArrayList;


public class PrimeNumberGenerator {

	public static ArrayList<Integer> generate(int numb){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int k=2; k<numb; k++) {
			if (isPrime(k)) {
				primes.add(k);
			}
		}
		return primes;
	}
	
	public static boolean isPrime(int numb) {
		for (int k=2; k<=Math.sqrt(numb);k++) {
			if (numb % k == 0) {
				return false;
			}
		}
		return true;
	}
}
