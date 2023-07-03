package June5;
public class Reverse {

	public static void main(String[] args) {
		int n=101;
		int ans=0;
		while(true)
		{	if (n==0) {
			break;
		}
		else {
			int nn=n%10;
			
			ans=nn+(ans*10);
			
			n/=10;
		}
		}
		System.out.println(ans);
	}

}
