package com.example.Programs;
import java.util.ArrayList;
import java.util.List;

public class Fibonachi {
	public void test(int n){
	ArrayList<Integer> l= new ArrayList<>();
	l.add(0);
	l.add(1);
	for (int i=0;i<n-2;i++) {
		l.add(l.get(i+1)+l.get(i));
	}
	System.out.println(l);
	}
	public static void main(String [] args) {
		Fibonachi f=new Fibonachi();
		f.test(5);
	}
	
	
}
