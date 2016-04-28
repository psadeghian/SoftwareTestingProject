package testSuite;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Eric on 4/26/2016.
 */
public class MathTest {

    @Test
    public void testMax() throws Exception {


        assertEquals(0.0f/0.0f,Math.max(0.0f/0.0f,0.0f),0.0f); //ab
        assertEquals(1.01f,Math.max(-1.01f,1.01f),0.0f); //acfi
        assertEquals(1.01f,Math.max(1.01f,0.0f),0.0f); //acfh
        assertEquals(0.0f,Math.max(0.0f,-0.0f),0.0f); //acdeg
        assertEquals(1.01f,Math.max(0.0f,1.01f),0.0f); //acdfi
        assertEquals(0.0f,Math.max(-0.0f,0.0f),0.0f); //acdefi
        assertEquals(0.0f,Math.max(0.0f,-1.01f),0.0f); //acdfh
        assertEquals(0.0f,Math.max(0.0f,0.0f),0.0f); //acdefh

        //assertEquals(0.0f/0.0f,Math.max(0.0f,0.0f/0.0f),0.0f); //ab


        //assertEquals(e,Math.max(a,e),0.0f);

    }
}