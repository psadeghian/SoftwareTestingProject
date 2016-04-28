package testSuite;

import junit.framework.TestCase;

/**
 * Created by Andrew on 4/26/2016.
 */
public class MinTest extends TestCase
{


	public void testMin() {
		
		//TESTS FOR NODE COVERAGE
		
				
		//Test for Node Coverage path: (1,2,4,8,10) 
		assertEquals(1.0f, Math.min(1.0f,2.0f));

		//Test for Node Coverage path: (1,2,4,8,9) 
		assertEquals(1.0f, Math.min(3.0f,1.0f));
		
		//Test Node Coverage (1,2,4,5,6,7) 
		assertEquals(-0.0f, Math.min(+0.0f,-0.0f));
		
		//Test for Node Coverage path: (1,2,3) 
		assertEquals(0.0f/0.0f, Math.min(0.0f/0.0f, 0.0f));
				
				
		
		
		
		//TESTS FOR EDGE COVERAGE
		
		//Test for Edge Coverage path: (1,2,4,5,8,10) 
		assertEquals(0.0f, Math.min(0.0f, 2.0f));
		
		//Test for Edge Coverage path: (1,2,4,5,6,8,10) 
		assertEquals(0.0f, Math.min(0.0f,+0.0f));
		
		
		
		
		
		//TESTS FOR EDGE-PAIR COVERAGE
		
		//Test for Edge-Pair Coverage path: (1,2,4,5,8,9) 
		assertEquals(-2.0f, Math.min(0.0f,-2.0f));
		
		//Test for Edge-Pair Coverage path: (1,2,4,5,6,8,9)
		assertEquals(0.0f, Math.min(+0.0f,0.0f));		
		
		
	}
	
}