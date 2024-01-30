package javatestcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class Mathutilstest {

	@Test
	public void test() {
		MathsUtils result = new MathsUtils();
		
		assertEquals(25, result.add(20, 5));
		assertEquals(30, result.multiply(10, 3));
		assertEquals(10, result.subtract(20,10));
		
	}

}
