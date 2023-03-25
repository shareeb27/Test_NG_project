package com.Test_NG_Annotations;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
public class Simple_Annotations {
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("set property");
	}
	
	@BeforeTest
	private void browser_launch() {
		System.out.println("browser launch");
	}
	
	@BeforeClass
	private void url_launch() {
		System.out.println("url launch");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}
	
	@Test(enabled = false)
    private void mobile() {
	    System.out.println("mobiles");
    }	

	@Test(priority = -1)
	private void television() {
		System.out.println("television");
	}
	@Ignore
	@Test
	private void laptops() {
		System.out.println("laptops");
	}
	
	@Test(invocationCount = 2)
	private void headphones() {
		System.out.println("headphones");
	}
	
	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	private void home_page() {
		System.out.println("Home page");
	}
	
	@AfterTest
	private void cookies() {
		System.out.println("coookies Removed");
	}
	
	@AfterSuite
	private void page_close() {
		System.out.println("page closedd...!!");
	}
	
}
