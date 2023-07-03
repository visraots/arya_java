package com.example.Rotation;

import java.util.Arrays;

public class Reversea {
	
	static int[] c = new int[]{7348,2,23,4,9,6,9};
	
	public static void main(String[] args) {
		for (int i=0;i<(c.length)/2;i++) {
			int temp=c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]=temp;
		}
		System.out.print(Arrays.toString(c));

	}

}
