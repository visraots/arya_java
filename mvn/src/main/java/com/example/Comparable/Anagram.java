package com.example.Comparable;

import java.util.Arrays;

public class Anagram {
	String[] arr1;
	String[] arr;

	public void sortn(String[] arr1) {
		int i,j;
		String key;
		  
		  for (j = 1; j < arr1.length; j++) 
		  { 
		    key = arr1[j];
		    i = j - 1;
		    while (i >= 0) {
		      if (key.compareTo(arr1[i]) > 0) 
		      {
		        break;
		      }
		      arr1[i + 1] = arr1[i];
		      i--;
		    }
		    arr1[i + 1] = key;
		   
		  }
		  this.arr1=arr1;
	}
		  
		  public void sortn1(String[] arr) {
				int i,j;
				  String key;
				  
				  for (j = 1; j < arr.length; j++) 
				  { 
				    key = arr[j];
				    i = j - 1;
				    while (i >= 0) {
				      if (key.compareTo(arr[i]) > 0) 
				      {
				        break;
				      }
				      arr[i + 1] = arr[i];
				      i--;
				    }
				    arr[i + 1] = key;
				   
				  }
				  this.arr=arr;
		  
		  
	}
		  public void test() {
			  
			  System.out.print(Arrays.equals(arr, arr1));
		  }
		
		

	public static void main(String[] args) {
		String[] inputArray = {"R","A","C","E"};
		String[] inputArray1 = {"C","A","R","E"};
		Anagram a=new Anagram();
		a.sortn(inputArray1);
		a.sortn1(inputArray);
		a.test();
		}
	
	}


