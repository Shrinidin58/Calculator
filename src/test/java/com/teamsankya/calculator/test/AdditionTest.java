package com.teamsankya.calculator.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.teamsankya.calculator.operations.Addition;


@RunWith(Parameterized.class)
public class AdditionTest {
	private int a;
	private int b;
	private int sum;
	public AdditionTest(int a, int b, int sum) {
		this.a=a;
		this.b=b;
		this.sum=sum;	}
 @Test
	public void addIntTest() {
		int sum = Addition.add(20, 30);
		Assert.assertEquals(this.sum, sum);
		
		
		
		
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



