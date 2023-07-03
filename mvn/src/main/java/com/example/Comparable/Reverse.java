package com.example.Comparable;

public class Reverse {
	StringBuilder myName = new StringBuilder("doman okza");
	public void test() {
	
	int l=myName.length();
	for (int i=0;i<l/2;i++) {
		char temp=myName.charAt(i);
		myName.setCharAt(i,myName.charAt(l-i-1));
		
		myName.setCharAt(l-i-1,temp);
		
	}
	System.out.print(myName);
	}
	public static void main(String[] args) {
		
		Reverse r=new Reverse();
		r.test();

	}

}
