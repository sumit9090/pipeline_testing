package com.selenium.maventesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegTest {
	SoftAssert st=new SoftAssert();
	@Test
	public void doRegister()
	{
		String expected="Sumit";
		String actual="Sumit";
		Assert.assertEquals(expected, actual);
		//Assert.assertTrue(2>1,"test");
		//Assert.fail();
		
		//st.assertEquals(expected, actual);
		//st.assertAll();
	}

}
