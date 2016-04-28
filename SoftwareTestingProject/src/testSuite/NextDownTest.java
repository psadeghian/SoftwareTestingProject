package testSuite;

import junit.framework.TestCase;

/**
 * Created by Parker on 4/26/2016.
 */
public class NextDownTest extends TestCase
{

	public NextDownTest(String nm)
	{
		super(nm);
	}
	public void testPositiveDouble() {	
		assertEquals(Math.nextDown(0.112234454756765),  0.11223445475676498);     
	}
	public void testNegativeDouble() {	
		assertEquals(Math.nextDown(-.2345f),  -0.23450000584125522);     
	}
	public void testNaN() {	
      		assertEquals(Double.NaN,Math.nextDown(Double.NaN));     
   	}
   	public void testNegInfinity() {	
       		assertEquals(Double.NEGATIVE_INFINITY, Math.nextDown(Double.NEGATIVE_INFINITY));     
   	}
   	public void testZero() {	
       		assertEquals(Math.nextDown(0.0), -Double.MIN_VALUE);     
   	}


}