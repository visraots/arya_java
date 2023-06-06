package June5;

public class FizzBuzz {

	public static void main(String[] args) {
		int flag=0;
		int c=0;
		for (int i=1;i<=100;i++) {
			if (flag==0){
			if(i%3==0) {
				System.out.println("Fizz");
				c=1;
			}
			if(i%5==0) {
				System.out.println("Buzz");
				c=1;
			}
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
				c=1;
			}
			if(c==1) {
				flag=0;
				c=0;
			}
			else {
				flag=1;
			}
			}
			if(flag==1) {
				System.out.println(i);
				flag=0;
			}
		}

	}

}
