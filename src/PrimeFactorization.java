import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class PrimeFactorization {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		assertEquals(list(), PrimeFactor.generate(1));
	}

	private List<Object> list() {
		return Arrays.asList();
	}

}
