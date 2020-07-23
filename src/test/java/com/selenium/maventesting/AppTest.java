package com.selenium.maventesting;

import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AppTest 
{
	@Test
	public void testing()
	{
		System.out.println("this is testNG");
	}
	
	
	@Test
	public void testing2()
	{
		throw new SkipException("skipping");
		//System.out.println("this is another testNG");
	}
   
	@BeforeTest
	public void beforetest()
	{
		System.out.println("this is before test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("this is after test");
	}
	
	
	@BeforeSuite
	public void beforesuite()
	{
		//throw new SkipException("any reason");
		System.out.println("this is before suite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("this is after suite");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this is before method");
	}
	
	@AfterTest
	public void aftermethod()
	{
		System.out.println("this is after method");
	}
}
