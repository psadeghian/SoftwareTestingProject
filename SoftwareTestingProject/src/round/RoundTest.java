package round;

import static org.junit.Assert.*;

import org.junit.Test;

import sun.misc.FloatConsts;

public class RoundTest {
	Round round = new Round();
	// The purpose of this instantiation is to achieve 100% statement 
	// coverage on Cobertura. 
	
	@Test
	// Path: B1-B2
	public void testPosInfinity() {
        double doubleNum = Double.POSITIVE_INFINITY;
		assertEquals(Round.round(doubleNum), (long)Double.POSITIVE_INFINITY,0);
	}
	@Test
	// Path: B1-B3-B4
	public void testPosNumber() {
        double doubleNum = 12.2;
		assertEquals(Round.round(doubleNum), (long)12,0);
	}
	@Test
	// Path: B1-B3-B5
	public void testNegNumber() {
        double doubleNum = 	-10.8;
		assertEquals(Round.round(doubleNum), (long)-11,0);
	}

}
