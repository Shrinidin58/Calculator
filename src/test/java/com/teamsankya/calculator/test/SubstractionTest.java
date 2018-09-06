package com.teamsankya.calculator.test;

import org.junit.Assert;
import org.junit.Test;

import com.teamsankya.calculator.operations.Sub;

public class SubstractionTest {

	
	@Test
	public void addIntTest() {
		int sub = Sub.substraction(30, 30);
		Assert.assertEquals(0, sub);
 }
}
