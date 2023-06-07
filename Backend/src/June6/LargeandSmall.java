package June6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LargeandSmall {
	
	int[] a = new int[]{7348,2,23,4,9,6,9};
	int i2=a[0];
	int i1=a[0];
	public void test() {
		for (int i=0;i<a.length;i++) {
			if (a[i]<i2) {
				i2=a[i];
			}
			else if(a[i]>i1){
				i1=a[i];
			}
		}
		System.out.println("Largest Number is"+ i1);
		System.out.println("Smallest Number is"+ i2);
		
	}
	public static void main(String[] args) {
		LargeandSmall ls=new LargeandSmall();
		ls.test();
		
	}

}
