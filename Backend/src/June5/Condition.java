package June5;

public class Condition {
	
	public void check(int age) {
		if (age>=15 && age<=19) {
			System.out.println("Kid");
		}
		else if(age<13) {
			System.out.println("Teen");
		}
		else if (age>19) {
			System.out.println("Adult");
		}
	}
public static void main(String [] args) {
	Condition c=new Condition();
	c.check(20);
}
}
