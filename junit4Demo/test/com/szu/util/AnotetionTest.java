package com.szu.util;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnotetionTest {


	@Test(expected=ArithmeticException.class)
	public void testDivide(){
		assertEquals(3, new Caculate().divide(3, 0));
	}
	
	@Test(timeout=3000)
	public void testReadFile() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
