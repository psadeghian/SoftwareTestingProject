package testSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import sun.misc.FloatConsts;

/**
 * Created by Pasha on 4/26/2016.
 */
public class RoundTest {
	@Test
	// Path: B1-B2
	public void testPosInfinity() {
        double doubleNum = Double.POSITIVE_INFINITY;
		assertEquals(Math.round(doubleNum), (long)Double.POSITIVE_INFINITY,0);
	}
	@Test
	// Path: B1-B3-B4
	public void testPosNumber() {
        double doubleNum = 12.2;
		assertEquals(Math.round(doubleNum), (long)12,0);
	}
	@Test
	// Path: B1-B3-B5
	public void testNegNumber() {
        double doubleNum = 	-10.8;
		assertEquals(Math.round(doubleNum), (long)-11,0);
	}

}
