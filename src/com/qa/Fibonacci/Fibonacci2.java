package com.qa.Fibonacci;

public class Fibonacci2 {
public int fibonacciSequence (int num) {
	if(num ==0) {
		return 0;
	}
	int firstPosition = 0;
			int nextPosition = 1;
	for (int i = 0; i < num - 1; i++) {
		int temp = firstPosition;
		firstPosition = nextPosition;
		nextPosition = firstPosition + temp;
	}
	return nextPosition;
}
	
}

