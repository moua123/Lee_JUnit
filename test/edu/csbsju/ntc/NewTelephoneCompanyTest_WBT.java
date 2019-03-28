package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;

	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}


	@Test(expected=UnsupportedOperationException.class)
	  public void testComputeCharge_InvalidStartTime() {
	    ntc.setStartTime(2401);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	  }
		

	@Test(expected=UnsupportedOperationException.class)
	  public void testComputeCharge_InvalidDuration() {
	    ntc.setStartTime(801);
	    ntc.setDuration(0);
	    ntc.computeCharge();
	}
	
	 @Test
	  public void testComputeCharge_BothDiscounts() {
	    ntc.setStartTime(759);
	    ntc.setDuration(61);
	    double expResult = 1078.48 ;
	    assertTrue(expResult==ntc.computeCharge());
	  }
	 
	 @Test
	  public void testComputeCharge_NoDiscounts() {
	    ntc.setStartTime(800);
	    ntc.setDuration(1);
	    double expResult = 41.6  ;
	    assertTrue(expResult==ntc.computeCharge());
}
	 
	 @Test
	  public void testComputeCharge_DurationDiscount() {
	    ntc.setStartTime(900);
	    ntc.setDuration(61);
	    double expResult = 2156.96  ;
	    assertTrue(expResult==ntc.computeCharge());
	  } 
	 
	 @Test
	  public void testComputeCharge_StartTimeDiscount() {
	    ntc.setStartTime(1800);
	    ntc.setDuration(10);
	    double expResult = 208.0;
	    assertTrue(expResult==ntc.computeCharge());
	 }
}