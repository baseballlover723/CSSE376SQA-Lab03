import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeNumberTest {

	private	Object input;
	private ArrayList<Integer> expectedResult;

	public PrimeNumberTest(Integer input, ArrayList<Integer> expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> primeNumbers() {
		return Arrays.asList(new Object[][] {
				{2, new ArrayList<Long>()},
				{3, new ArrayList<Long>(Arrays.asList(2L))},
				{5, new ArrayList<Long>(Arrays.asList(2L, 3L))},
				{10, new ArrayList<Long>(Arrays.asList(2L, 3L, 5l, 7l))},
				{20, new ArrayList<Long>(Arrays.asList(2L,3L,5L,7L,11L,13L,17L,19L))},

		});
	}
	
	@Test
	public void testPrimeNumberGenerator() {
		System.out.println("Parameterized Number is : " + this.input);
		assertEquals(this.expectedResult, PrimeNumberGenerator.generate((Integer) this.input));
	}

}
