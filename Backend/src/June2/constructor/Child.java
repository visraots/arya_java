package June2.constructor;

public class Child extends Parent{
    int val2;
    public Child(int val1, int val2){
        super(val1);
        this.val2=val2;
    }
    public Child(int val2){
      super();
      this.val2=val2;
    }

    public static void main(String [] args){
      Child c=new Child(25);

    }
}
