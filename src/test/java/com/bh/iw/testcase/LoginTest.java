package com.bh.iw.testcase;

import org.testng.annotations.Test;

import com.bh.iw.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test(priority=0)
	public void validLoginTest() {
		System.out.println(driver.getTitle());
		System.out.println("Valid Login");
	}
	
	@Test(priority=1)
	public void validInLoginTest() {
		System.out.println(driver.getTitle());
		System.out.println("Invalid Login");	
		System.out.println("added new invalid Login");
	}
	

}
