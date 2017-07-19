package com.szu.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaculateTest {

	

	@Test
	public void testadd(){
		assertEquals(6, new Caculate().Add(3, 3));
	}
	@Test
	public void testSub(){
		assertEquals(3, new Caculate().sub(5, 2));
	}
}
