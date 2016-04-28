package testSuite;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Test;

/**
 * Created by Pasha on 4/26/2016.
 */
public class NextUpTest {
	@Test
	// Path: B1-B2
	public void testNaN() {
        double doubleNum = 0.0/0.0;
		assertEquals(Math.nextUp(doubleNum), Double.NaN,0);
	}
	@Test
	// Path: B1-B3-B2
	public void testPosInfinity() {
        double doubleNum = Double.POSITIVE_INFINITY;
		assertEquals(Math.nextUp(doubleNum), Double.POSITIVE_INFINITY,0);
	}
	@Test
	// Path: B1-B3-B4-B7-B6
	public void testPosNumber() {
        double doubleNum = 12;
		assertEquals(Math.nextUp(doubleNum), (double)12.000000000000002,0);
	}
	@Test
	// Path: B1-B3-B4-B5-B6
	public void testNegNumber() {
        double doubleNum = 	-10;
		assertEquals(Math.nextUp(doubleNum), (double)-9.999999999999998,0);
	}

}
