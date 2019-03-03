package java3;

import org.junit.Assert;
import org.junit.Test;

import pl.edu.agh.mwo.FizzBuzz;



public class FizzBuzzTest {
	
	@Test
	public void testValue1() {
		Assert.assertEquals("1", FizzBuzz.test()[1]);
	}
	
	@Test
	public void testValue3() {
		Assert.assertEquals("Fizz", FizzBuzz.test()[3]);
	}
	
	@Test
	public void testValue5() {
		Assert.assertEquals("Buzz", FizzBuzz.test()[5]);
	}
	
	@Test
	public void testValue15() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.test()[15]);
	}

}
