package com.teamsankya.calculator.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.teamsankya.calculator.operations.Addition;



public class AdditionTest {
	
	
 @Test
	public void addIntTest() {
		int sum = Addition.add(20, 30);
		Assert.assertEquals(50, sum);
		
		
		
		
	/*	public static void inputsAndOutputs() {
		return Arrays.asList(new Object[][] {
		{1,2,3},
		{5,5,10},
		{7,3,10},
		{-4,5,1}
		});
		}
		*/
		
 }
}



