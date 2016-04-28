package roundTest;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Test;

import sun.misc.FloatConsts;

public final class RoundTest {
	// The purpose of this test is to gain 100% statement coverage without 
	// instantiating the class. 
	@Test
	public void evilConstructorInaccessibilityTest() throws Exception {
	    Constructor[] ctors = Round.class.getDeclaredConstructors();
	    assertEquals("Utility class should only have one constructor",
	            1, ctors.length);
	    Constructor ctor = ctors[0];
	    assertFalse("Utility class constructor should be inaccessible", 
	            ctor.isAccessible());
	    ctor.setAccessible(true); // obviously we'd never do this in production
	    assertEquals("You'd expect the construct to return the expected type",
	            Round.class, ctor.newInstance().getClass());
	}
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
