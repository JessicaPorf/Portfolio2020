package com.qa.Palindrome;

public class Palindrome {

	public boolean palindrome (String sentence) {
		//ignore case 
		//sentence toLowerCase(); 
		
		//ignore spaces
		//iteration
		//check for spaces 
		//else add letter to new string 
		
		//check forward is the same as back 
		//create a new reverse string
		//compare front to the back
		//compare first half to last half
		//reverse method 
		
		//could use StringBuilder 
		
		String sen = sentence.replace( " ", "").toLowerCase();
			String reversedstring="";
		for (int i = sen.length()-1; i >=0; i--) {
			reversedstring = reversedstring + sen.charAt(i);
		}
		return sen.equals(reversedstring);
		
		}
		
	}

