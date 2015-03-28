import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class PrimeFactorization {

	private List<Integer> list(Integer... ints) {
		return Arrays.asList(ints);
	}

	@Test
	public void test1() {
		assertEquals(list(), PrimeFactor.generate(1));
	}

	@Test
	public void test2() {
		assertEquals(list(2), PrimeFactor.generate(2));
	}

	@Test
	public void test3() {
		assertEquals(list(3), PrimeFactor.generate(3));
	}
	
	@Test
	public void test4() {
		assertEquals(list(2,2), PrimeFactor.generate(4));
	}


}
