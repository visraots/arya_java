package com.example.Comparable;

public class vowels {
	String s="Awerya";
	public void test() {
	int c=0;
	for(int i=0;i<s.length();i++) {
		if (Character.toUpperCase(s.charAt(i))=='A' ||Character.toUpperCase(s.charAt(i))=='E'||Character.toUpperCase(s.charAt(i))=='I'||Character.toUpperCase(s.charAt(i))=='O'||Character.toUpperCase(s.charAt(i))=='U' ) {
			c+=1;
		}
	}
	System.out.print(c);
	}
	public static void main(String[] args) {
		vowels v=new vowels();
		v.test();

	}

}