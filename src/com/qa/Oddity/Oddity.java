package com.qa.Oddity;


	import java.util.ArrayList;
	import java.util.List;

public class Oddity {

		public List<Integer> oddity(int[] nums) {
			List<Integer> numList = new ArrayList<>();
			for (int numbers : nums) {
				if (numbers % 2 != 0) {
					numList.add(numbers);
				}
			}
			return numList;
		}
	}


