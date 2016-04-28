package nextUpTest;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class NextUpTest {
	// The purpose of this test is to gain 100% statement coverage without 
	// instantiating the class. 
	@Test
	public void evilConstructorInaccessibilityTest() throws Exception {
	    Constructor[] ctors = NextUp.class.getDeclaredConstructors();
	    assertEquals("Utility class should only have one constructor",
	            1, ctors.length);
	    Constructor ctor = ctors[0];
	    assertFalse("Utility class constructor should be inaccessible", 
	            ctor.isAccessible());
	    ctor.setAccessible(true); // obviously we'd never do this in production
	    assertEquals("You'd expect the construct to return the expected type",
	            NextUp.class, ctor.newInstance().getClass());
	}
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
