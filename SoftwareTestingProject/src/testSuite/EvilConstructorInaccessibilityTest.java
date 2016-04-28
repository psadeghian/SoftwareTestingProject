package testSuite;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Test;

/**
 * Created by Pasha on 4/26/2016.
 */
public class EvilConstructorInaccessibilityTest {
	// The purpose of this test is to gain 100% statement coverage without 
	// instantiating the class. 
	@Test
	public void evilConstructorInaccessibilityTest() throws Exception {
	    Constructor[] ctors = Math.class.getDeclaredConstructors();
	    assertEquals("Utility class should only have one constructor",
	            1, ctors.length);
	    Constructor ctor = ctors[0];
	    assertFalse("Utility class constructor should be inaccessible", 
	            ctor.isAccessible());
	    ctor.setAccessible(true); // obviously we'd never do this in production
	    assertEquals("You'd expect the construct to return the expected type",
	            Math.class, ctor.newInstance().getClass());
	}

}
