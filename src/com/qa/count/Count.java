package com.qa.count;

public class Count {
	public void chicken And rabbit (int heads, int legs)
	
boolean solution = false;
for(int i=0; i <= heads;i++) {
	int r = heads -i;
	int c = i;
	if ((r*4+c*2)==legs){
		System.out.println("rabbit:" + r);
		System.out.println("chicken:" + c);
		solution = true;
	}
}
if(!solution) {
	System.out.println("no solution avaliable");
		
	}
}
}
