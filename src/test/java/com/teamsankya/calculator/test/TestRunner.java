package com.teamsankya.calculator.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.teamsankya.calculator.test.AdditionTest;

import junit.framework.TestCase;

public class TestRunner {

	 public static void main(String[] args) 
		
	
		
		{ Result result = JUnitCore.runClasses(TestCase.class);
		List<Failure> failures = result.getFailures();
		for (Failure failure : failures) {
		System.out.println(failure.getMessage());
		}
		System.out.println(result.wasSuccessful());
		}
		
	}


