/**
 * Cobertura - http://cobertura.sourceforge.net/
 *
 * Copyright (C) 2003 jcoverage ltd.
 * Copyright (C) 2005 Mark Doliner <thekingant@users.sourceforge.net>
 *
 * Cobertura is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 *
 * Cobertura is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cobertura; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 */

package com.example.simple;

import junit.framework.TestCase;

public class SimpleTest extends TestCase
{

	final Simple simple = new Simple();

	public SimpleTest(String nm)
	{
		super(nm);
	}
	public void testPositiveDouble() {	
		assertEquals(simple.nextDown(0.112234454756765),  0.11223445475676498);     
	}
	public void testNegativeDouble() {	
		assertEquals(simple.nextDown(-.2345f),  -0.23450000584125522);     
	}
	public void testNaN() {	
      		assertEquals(Double.NaN,simple.nextDown(Double.NaN));     
   	}
   	public void testNegInfinity() {	
       		assertEquals(Double.NEGATIVE_INFINITY, simple.nextDown(Double.NEGATIVE_INFINITY));     
   	}
   	public void testZero() {	
       		assertEquals(simple.nextDown(0.0), -Double.MIN_VALUE);     
   	}


}