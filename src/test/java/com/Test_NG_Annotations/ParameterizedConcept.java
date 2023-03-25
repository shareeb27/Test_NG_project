package com.Test_NG_Annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedConcept {
	
	
	@Test
	@Parameters({"email","password"})
	private void instagram(String email , String password) {
		System.out.println("Email :" + email);
		System.out.println("password :" + password);
	}
	

}
