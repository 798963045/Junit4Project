package com.szu.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErrorAndFailureTest {


	@Test
	public void testadd(){
		assertEquals(5, new Caculate().Add(3, 3));
	}
	
	@Test
	public void testDivide(){
		assertEquals(3, new Caculate().divide(3, 0));
	}
}
