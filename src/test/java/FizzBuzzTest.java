import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FizzBuzzTest {

	public static final int LIST_SIZE = 100;

	@Test
	public void shouldReturnAlistOfOneHundredElement() {
		String[] list = getValues();
		assertTrue(list.length == LIST_SIZE);
	}

	@Test
	public void shouldReturnFizzInForAMultipleOfThree() {
		isFizz(3);
		isFizz(6);
		isFizz(9);

	}

	@Test
	public void shouldReturnFizzForANumberThatHaveAThree() {
		isFizz(31);
	}

	@Test
	public void shouldReturnFizzForANumberThatHaveAFive() {
		isBuzz(52);
	}

	@Test
	public void shouldReturnFizzBuzzForANumberThatHaveAFiveAndAThree() {
		isFizzBuzz(35);
		isFizzBuzz(53);
	}

	@Test
	public void shouldReturnBuzzInForAMultipleOfFive() {
		isBuzz(5);
		isBuzz(10);
		isBuzz(25);

	}

	@Test
	public void shouldReturnFizzBuzzInForAMultipleOfThreeAndFive() {
		isFizzBuzz(15);
		isFizzBuzz(30);

	}

	private void isFizz(Integer position) {
		assertEquals(FizzBuzz.FIZZ, getFizzBuzzValue(position));
	}

	private void isBuzz(Integer position) {
		assertEquals(FizzBuzz.BUZZ, getFizzBuzzValue(position));
	}

	private void isFizzBuzz(Integer position) {
		assertEquals(FizzBuzz.FIZZBUZZ, getFizzBuzzValue(position));
	}

	private String getFizzBuzzValue(int i) {
		String[] values = getValues();
		return values[i-1];
	}

	private String[] getValues() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		return fizzBuzz.values();
	}

}
