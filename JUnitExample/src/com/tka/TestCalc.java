package com.tka;

import junit.framework.TestCase;

public class TestCalc extends TestCase{
        
	   Calculator obj;
	   
	   @Override
	   public void setUp() {
		   obj=new Calculator();
				   
	   }
	   public void testAdd() {
		   assertEquals(30, obj.add(20, 10));
	   }
	   
	   public void testSubstract() {
		   assertEquals(10, obj.substract(20, 10));
	   }
	   
	   
	   @Override
	   public void tearDown() {
		   obj=null;
				   
	   }
}
