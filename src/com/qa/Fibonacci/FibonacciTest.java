package com.qa.Fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void recurssionTest() {
		Fibonacci run = new Fibonacci ();
		assertEquals(102334155 , run.fibonacci(40));
	}

	
    @Test 
    public void iterationTest() {
    	Fibonacci2 run = new Fibonacci2();
		assertEquals(102334155 , run.other(40));
	}

    }

    
}
