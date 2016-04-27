package nextUp;

import static org.junit.Assert.*;

import org.junit.Test;

import sun.misc.FloatConsts;

public class NextUpTest {
	NextUp nextUp = new NextUp();
	@Test
	public void testNaN() {
        double doubleNum = 0.0/0.0;
		assertEquals(NextUp.nextUp(doubleNum), FloatConsts.NaN,0);
	}
	@Test
	public void testPosInfinity() {
        double doubleNum = FloatConsts.POSITIVE_INFINITY;
		assertEquals(NextUp.nextUp(doubleNum), FloatConsts.POSITIVE_INFINITY,0);
	}
	@Test
	public void testPosNumber() {
        double doubleNum = 12;
		assertEquals(NextUp.nextUp(doubleNum), (double)12.000000000000002,0);
	}
	@Test
	public void testNegNumber() {
        double doubleNum = 	-10;
		assertEquals(NextUp.nextUp(doubleNum), -9.999999999999998,0);
	}

}
