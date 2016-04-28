package nextUp;

import static org.junit.Assert.*;

import org.junit.Test;

import sun.misc.FloatConsts;

public class NextUpTest {
	NextUp nextUp = new NextUp();
	@Test
	// Path: B1-B2
	public void testNaN() {
        double doubleNum = 0.0/0.0;
		assertEquals(NextUp.nextUp(doubleNum), Double.NaN,0);
	}
	@Test
	// Path: B1-B3-B2
	public void testPosInfinity() {
        double doubleNum = Double.POSITIVE_INFINITY;
		assertEquals(NextUp.nextUp(doubleNum), Double.POSITIVE_INFINITY,0);
	}
	@Test
	// Path: B1-B3-B4-B7-B6
	public void testPosNumber() {
        double doubleNum = 12;
		assertEquals(NextUp.nextUp(doubleNum), (double)12.000000000000002,0);
	}
	@Test
	// Path: B1-B3-B4-B5-B6
	public void testNegNumber() {
        double doubleNum = 	-10;
		assertEquals(NextUp.nextUp(doubleNum), (double)-9.999999999999998,0);
	}

}
