import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;


public class PrimeNumberTest {

	private Integer input;
	private ArrayList<Integer> expectedResult;

	public void PrimeNumberGeneratorTest(Integer input, ArrayList<Integer> expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
				{2, Arrays.asList()},
				{3, Arrays.asList(new int[] {2})},
				{4, Arrays.asList(new int[] {2,3})},
				{5, Arrays.asList(new int[] {2,3})},
				{10, Arrays.asList(new int[] {2,3,5,7})}
			});
	}
	
	@Test
	public void testPrimeNumberGenerator() {
		System.out.println("Parameterized Number is : " + this.input);
		assertEquals(this.expectedResult, PrimeNumberGenerator.generate(this.input));
	}

}
