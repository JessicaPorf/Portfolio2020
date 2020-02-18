package com.qa.Factorials;

public class Factorials {
	
	public int factorials (int i) {
		int number = 1;
		
		for(; i > 0; i--) {
			number = number * i;
		}
		return number;
	}
	}


