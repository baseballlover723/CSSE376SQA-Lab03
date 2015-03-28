import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
				{2, new ArrayList<Integer>()},
				{3, new ArrayList<Integer>(Arrays.asList(2))},
				{5, new ArrayList<Integer>(Arrays.asList(2, 3))},
				{10, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7))},
				{20, new ArrayList<Integer>(Arrays.asList(2,3,5,7,11,13,17))},
		});
	}
	
	@Test
	public void testPrimeNumberGenerator() {
		System.out.println("Parameterized Number is : " + this.input);
		assertEquals(this.expectedResult, PrimeNumberGenerator.generate((Integer) this.input));
	}

}
