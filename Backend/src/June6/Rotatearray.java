package June6;

import java.util.Arrays;

public class Rotatearray {
	
	static int[] b = new int[]{7348,2,23,4,9,6,9};
	int c=b.length;
	public void test(int n) {
		for (int i=0;i<n;i++) {
			int t=b[0];
			for(int j=0;j<c-1;j++) {
			
			b[j]=b[j+1];
			}
			b[c-1]=t;
		}	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotatearray ra=new Rotatearray();
		ra.test(3);
		System.out.print(Arrays.toString(b));
	}

}
