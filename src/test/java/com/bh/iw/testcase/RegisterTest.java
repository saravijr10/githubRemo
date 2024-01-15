package com.bh.iw.testcase;

import org.testng.annotations.Test;

import com.bh.iw.base.TestBase;

public class RegisterTest extends TestBase {
	
	
	@Test(priority=1)
	public void validRegisterTest() {
		System.out.println(driver.getTitle());
		System.out.println("Register");
	}
	
	@Test(priority=2)
	public void invalidRegisterTest() {
		System.out.println(driver.getTitle());
		System.out.println("Invalid Register");
		System.out.println("****************************");
	}

}
