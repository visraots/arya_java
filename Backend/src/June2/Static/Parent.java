package Jun2.Static;

public class Parent {
    static int val1;
    public static int func1(int val2){
        val1=val2;
        return val1;
    }
    static {
        func1(10);
    }

}
