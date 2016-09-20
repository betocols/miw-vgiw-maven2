package maven2.assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction f;
	
	@Before
	public void before() {
		f = new Fraction(2, 4);
	}
	
	@Test
	public void testFractionIntInt() {
		assertEquals(2, f.getNumerator());
		assertEquals(4, f.getDenominator());
	}

	@Test
	public void testFraction() {
		f = new Fraction(1, 1);
		assertEquals(1, f.getNumerator());
		assertEquals(1, f.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals(0.5, f.decimal(), 10e-5);
	}
}
